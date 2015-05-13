/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import business.control.LoginException;
import business.control.RemoveException;
import business.control.SenhaException;
import business.control.UserControl;
import business.model.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class UserAddForm {
    
    public static void main(String [] args){
        boolean flag = true;
        UserControl a = new UserControl();
        
        while(flag){
            String login = JOptionPane.showInputDialog("informe seu login(nome)");
            String senha = JOptionPane.showInputDialog("informe sua senha");

            try{
                flag = a.addUser(new User(login,senha));   
            }catch(LoginException eve){
                JOptionPane.showMessageDialog(null, eve.getMessage());
            }catch (SenhaException eve) {
                JOptionPane.showMessageDialog(null, eve.getMessage());
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Login realizado com Sucesso");
        
        JOptionPane.showMessageDialog(null,"removendo joão");
        
        try{
            a.removeUser("joão");
            JOptionPane.showMessageDialog(null,"removido com sucesso!!");
        }catch(RemoveException eve){
            JOptionPane.showMessageDialog(null, eve.getMessage());
        }
        
        
    }
}
