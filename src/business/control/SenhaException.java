/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

/**
 *
 * @author Augusto
 */
public class SenhaException extends Exception{
    private final String msg;
    
    public SenhaException(String msg){
        super(msg);
        this.msg = "Campo Senha INVALIDO\n" +msg;
    }
    
    @Override
    public String getMessage(){
        return msg;
    }
    //criar nossas excecoes
}
