/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appJava;

import modelDAO.UsuarioDAO;
import entity.Usuario;

/**
 *
 * @author gabri_
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setDia_data("02/11/2023");
        u.setBandeira("Mastercard");
        u.setValor(100);
        u.setPagamento("Cartão");        
        u.setParcelamento("2x");
        
        new UsuarioDAO().cadastroUsuario(u);
    }
}
