package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ConnectionFactory;

public class TestaRemover {
    public static void main(String[] args) {
        int idParaRemover = 4;
        Connection con = new ConnectionFactory().getConexao();

        String sql = "DELETE FROM usuario WHERE id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idParaRemover);
            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Usuario removido com sucesso. Linhas afetadas: "+linhasAfetadas);
        } catch (SQLException e) {
            System.out.println("Erro ao remover usuario. "+e.getMessage());
        }

        //Testar Listagem novamente
    }
}
