/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

/**
 *
 * @author gabri_
 */
public class itemDAO {
    private Connection con;
    
    public itemDAO() {
        con = conexao.getConexao();
    }
    
    public void inserir(item it) {
        String sql = "INSERT INTO "
    }
}
