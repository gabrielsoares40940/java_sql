
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

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/retifica";
    private static final String senha = "admin";
    private static final String usuario = "root";
    private static final Connection connection;

    public static Connection getConexao() {

        try {
            if (connection == null){
                connection = new DriveManager.getConnection(url, user, password);
                return  connection
            }else{
                return connection
            }
            return connection;
        }catch (SQLException e ){
            e.printStackTrace();
            return null;
        }

    }
}

