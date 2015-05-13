/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.control;

import business.model.User;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class UserControl implements Comparator<String>{
    Map usuarios = new TreeMap();
    
    public boolean addUser(User user) throws LoginException,SenhaException{
        //Confere login
        if(user.getLogin().equals("")){
            throw new LoginException("Campo vazio\n");
        }        
        if(user.getLogin().length() > 20){
            throw new LoginException("numero maximo de caracteres exedido\n");
        }
        if(user.getLogin().matches(".*\\d.*")){
            throw new LoginException("login digitado não pode conter numeros\n");
        }
        
        //Confere senha
        if(user.getSenha().length() > 12){
            throw new SenhaException("numero maximo de caracteres exedido\n");
        }
        if(user.getSenha().length() < 8){
            throw new SenhaException("senha deve conter no minimo 8 caracteres\n");
        }
        if(!user.getSenha().matches(".*\\d.*\\d.*")){
            throw new SenhaException("senha deve conter pelo menos dois numeros\n");
        }
            
        usuarios.put(user.getLogin(),user.getSenha());
        return false;
    }
    
    public void removeUser(String login) throws RemoveException{
        Collection use = usuarios.entrySet();
        Iterator it = use.iterator();
        boolean flag = false;
        
        while (it.hasNext()){
            Map.Entry caixinha  =  (Map.Entry) it.next(); 
            String log =  (String) caixinha.getKey(); 
           
            if(log.equals(login)){
                //remover login e senha
                flag = true;
            }
        
        }
        if(flag == false){
            throw new RemoveException("Usuario não encontrado");
        }
    }
    public int compare(String t, String t1) {
        return t.compareTo(t1);
    }
    
    
}
