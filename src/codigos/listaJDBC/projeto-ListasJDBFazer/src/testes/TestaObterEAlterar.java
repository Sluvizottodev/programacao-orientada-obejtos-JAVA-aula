package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conexao;
import modelo.ConnectionFactory;
import modelo.Usuario;

public class TestaObterEAlterar {
    public static void main(String[] args) {
        int idParaBuscarNoBD = 2;
        Connection con = new ConnectionFactory().getConexao();
        Usuario usuarioParaAlterar = null;

        //ObterUsuarioPeloId
        String sql = "SELECT * FROM usuario WHERE id=?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            //Passa os parâmetros
            stmt.setInt(1, idParaBuscarNoBD);
            ResultSet rs = stmt.executeQuery();
            rs.next();//Aponta para o primeiro e único registro
            usuarioParaAlterar = new Usuario( rs.getInt("id"), rs.getString("nome") );
            System.out.println("Usuario recuperado com sucesso!");
        }catch(SQLException e){
            System.out.println("Erro ao obter usuario. "+e.getMessage());
        }

        usuarioParaAlterar.mostrarDados();

        System.out.println("Ateraremos o nome para Ana Maria");
        usuarioParaAlterar.setNome("Ana Maria");

        sql = "UPDATE usuario SET nome = ? WHERE id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,usuarioParaAlterar.getNome());
            stmt.setInt(2, usuarioParaAlterar.getId());
            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Usuario alterado com sucesso. Linhas afetadas: "+linhasAfetadas);
        } catch (SQLException e) {
            System.out.println("Erro ao alterar usuario. "+e.getMessage());
        }

        System.out.println("Dados do usuario pos alteracao:");
        usuarioParaAlterar.mostrarDados();
    }
}
