/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Heather
 */
public class RfortuneMessage {
    public Object displayMessage(Object object) {
        String message = (String) object;
        System.out.println("\t*******************************************************************************");
        System.out.println("\t" + message);
        System.out.println("\t*******************************************************************************");
        return null; 
    }
}