
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.html.HTML.Tag.SELECT;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri_
 */

/*
public class conexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/retifica", "usuario", "senha");
            ResultSet cliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while (cliente.next()) {
                System.out.println("Nome: " + cliente.getString("nome"));
        }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado.");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        } finally {
            if (conexao != null) {
                conexao.close();
            }
    }
    }
}
*/

public class conexao {
    
    private static String url = "jdbc:mysql://localhost:3306/mercantil";
    private static String senha = "admin";
    private static String usuario = "root";
    private static Connection connection = null;
    static {
        conectar();
    }
    public static void conectar() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, usuario, senha);
                connection.setAutoCommit(false);
                System.out.println("Conexão deu certo!"); 
           } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConexao() {
        return connection;
    }
}

