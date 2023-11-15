/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 *
 * @author gabri_
 */
public class Java_banco {

   public static void main(String[] args) throws ClassNotFoundException {
       String url = "jdbc:mysql://localhost:3306/retifica";
       String usuario = "root";
       String senha = "";
       Class.forName("com.mysql.cj.jdbc.Driver");
     
       try {
           Connection conexao = DriverManager.getConnection(url, usuario, senha);
           
           System.out.println("Conexão bem sucedida!");
           conexao.close();
           
       } catch(SQLException e){
           System.out.println("Erro ao conectar");
       }  
   }
}