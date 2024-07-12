import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    static String serverName = "localhost";
    static String mydatabase = "filmedatabase";
    static String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    
    static String username = "root";
    static String password = "password";
    
    public static Connection getConexao() {
        Connection connBD = null;
        try {
            connBD = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            e.printStackTrace();
        }
        return connBD;
    }
}