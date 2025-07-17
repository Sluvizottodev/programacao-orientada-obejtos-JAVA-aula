package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements Persistivel<Usuario> {
    private String sql = null;
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    @Override
    public Usuario inserir(Usuario u) throws DominioException {
        this.sql = "INSERT INTO usuario(nome) VALUES(?)";
        try {
            this.stmt = this.con.prepareStatement(this.sql, Statement.RETURN_GENERATED_KEYS);
            this.stmt.setString(1, u.getNome());
            this.stmt.execute();
            this.rs = stmt.getGeneratedKeys();
            if (this.rs.next()) {
                int id = this.rs.getInt(1);
                u.setId(id);
                System.out.println("Usuario de nome " + u.getNome() + " inserido com o id " + u.getId() + ".");
            }
        } catch (SQLException e) {
            throw new DominioException("Erro ao inserir usuário: " + e.getMessage());
        }
        return u;
    }

    @Override
    public int alterar(Usuario u) throws DominioException {
        int linhasAfetadas = 0;
        this.sql = "UPDATE usuario SET nome = ? WHERE id = ?";
        try {
            this.stmt = this.con.prepareStatement(sql);
            this.stmt.setString(1, u.getNome());
            this.stmt.setInt(2, u.getId());
            linhasAfetadas = this.stmt.executeUpdate();
            System.out.println("Usuário de nome " + u.getNome() + " alterado com sucesso!");
        } catch (SQLException e) {
            throw new DominioException("Erro ao alterar usuário: " + e.getMessage());
        }
        return linhasAfetadas;
    }

    @Override
    public int excluir(int id) throws DominioException {
        int linhasAfetadas = 0;
        this.sql = "DELETE FROM usuario WHERE id = ?";
        try {
            this.stmt = this.con.prepareStatement(sql);
            this.stmt.setInt(1, id);
            linhasAfetadas = this.stmt.executeUpdate();
            System.out.println("Usuário removido com sucesso. Linhas afetadas: " + linhasAfetadas);
        } catch (SQLException e) {
            throw new DominioException("Erro ao remover usuário. " + e.getMessage());
        }
        return linhasAfetadas;
    }

    @Override
    public List<Usuario> listarTodos() throws DominioException {
        List<Usuario> usuarios = new ArrayList<>();
        this.sql = "SELECT * FROM usuario ORDER BY nome";
        try {
            this.stmt = con.prepareStatement(sql);
            this.rs = stmt.executeQuery();
            while (this.rs.next()) {
                Usuario u = new Usuario(this.rs.getInt("id"), this.rs.getString("nome"));
                usuarios.add(u);
            }
            System.out.println("Listagem de usuários obtida com sucesso!");
        } catch (SQLException e) {
            throw new DominioException("Erro ao listar usuários. " + e.getMessage());
        }
        return usuarios;
    }

    @Override
    public Usuario obterPeloId(int id) throws DominioException {
        this.sql = "SELECT * FROM usuario WHERE id = ?";
        Usuario usuarioAlterado = null;
        try {
            this.stmt = this.con.prepareStatement(this.sql);
            this.stmt.setInt(1, id);
            this.rs = stmt.executeQuery();
            if (this.rs.next()) {
                usuarioAlterado = new Usuario(this.rs.getInt("id"), this.rs.getString("nome"));
                System.out.println("Usuário recuperado com sucesso!");
            }
        } catch (SQLException e) {
            throw new DominioException("Erro ao obter usuário. " + e.getMessage());
        }
        return usuarioAlterado;
    }
}
