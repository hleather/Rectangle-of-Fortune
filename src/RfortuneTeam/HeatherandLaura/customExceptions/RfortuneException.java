/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.customExceptions;

/**
 *
 * @author Heather
 */
public class RfortuneException extends Exception {

    public RfortuneException() {
    }

    public RfortuneException(String message) {
       super(message);
    }

    public RfortuneException(String message, Throwable cause) {
        super(message, cause);
    }

    public RfortuneException(Throwable cause) {
        super(cause);
    }
    
}
