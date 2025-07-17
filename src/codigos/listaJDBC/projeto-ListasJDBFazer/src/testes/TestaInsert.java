package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

public class TestaInsert {
    public static void main(String[] args) {
        Usuario u = new Usuario("João");
        Connection con = null;

        // const de conexao
        final String URL = "jdbc:mysql://localhost:3306/basejdbc?useUnicode=true&characterEncoding=UTF-8";
        final String USER = "root";
        final String PASSWORD = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            // criando conexao
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectou!");

            String sql = "INSERT INTO usuario(nome) VALUES(?)";

            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, u.getNome()); // setar parametro

            stmt.executeUpdate(); // execução do insert

            // captura id gerado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                u.setId(id);
                System.out.println("Usuário de nome " + u.getNome() + " inserido com o id " + u.getId());
            }

            // fecha recursos
            rs.close();
            stmt.close();
            con.close();

        // tratando exceções
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou inserir: " + e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println("Erro com o driver: " + e.getMessage());
        }
    }
}

/* 
1 - Conexão: driver + URL + usuário + senha → Connection

2 - SQL: comando com ?

3 - PreparedStatement: prepare + set parametros ( O ? é um placeholder, um lugar reservado para um valor que você vai passar depois. )

4 -Executa: executeUpdate()

5 - Pega id: getGeneratedKeys()

6 - Fecha tudo

7 - Trata erro
 */