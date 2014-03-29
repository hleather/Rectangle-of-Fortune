/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.customExceptions;

/**
 *
 * @author Laura
 */
public class letterCheckException extends Exception {
    
    public letterCheckException(){
        
    }
    
    public letterCheckException(String message){
        super(message);
    }
    
    public letterCheckException(String message, Throwable cause){
        super(message, cause);
       
    }
    
    public letterCheckException(Throwable cause){
        super(cause);
    }
}
