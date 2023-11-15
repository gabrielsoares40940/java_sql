package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
    private static final String user = "root";
    private static final String password = "";
    private static Connection connection;

    public static Connection getConexao() {

        try {
            if (connection == null){
                connection = DriverManager.getConnection(url, user, password);
                return  connection;
            }else{
                return connection;
            }
        } catch (SQLException e){
            return null;
        }

    }
}
