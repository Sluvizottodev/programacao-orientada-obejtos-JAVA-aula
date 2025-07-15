package explicacoes.padroes_de_projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {
    private Connection conexao;
    private PreparedStatement stmt;
    private String sql;

    public ContatoDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato c) {
        try {
            if (conexao.isClosed()) {
                conexao = new ConnectionFactory().getConnection();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar conexão: " + e.getMessage());
        }

        sql = "INSERT INTO contatos (nome, email, endereco, dataNascimento) VALUES (?, ?, ?, ?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getEndereco());
            stmt.setDate(4, new java.sql.Date(c.getDataNascimento().getTimeInMillis()));
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
}
