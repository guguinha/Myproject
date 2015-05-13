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
public class RemoveException extends Exception{
    private final String msg;
    
    public RemoveException(String msg){
        super(msg);
        this.msg = "Error na remocao de usuario\n"+msg;
    }
    
    @Override
    public String getMessage(){
        return msg;
    }
    //criar nossas excecoes
}
