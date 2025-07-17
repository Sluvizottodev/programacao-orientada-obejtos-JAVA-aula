package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/basejdbc?UseUnicode=yes&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection conn = null;

    public static Connection getConexao(){
        if(conn==null)
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASSWORD);
                System.out.println("Conectou!");
            } catch (SQLException e) {
                System.out.println("Erro ao conectar. "+e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o drive. "+e.getMessage());
            }
            return conn;
    }
}
