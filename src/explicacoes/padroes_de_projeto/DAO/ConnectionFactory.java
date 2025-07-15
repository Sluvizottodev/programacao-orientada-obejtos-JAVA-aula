package explicacoes.padroes_de_projeto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/bd_exemplo_DAO";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de daodos: " + e.getMessage());
        }
    }
}
