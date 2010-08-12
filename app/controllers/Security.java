/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author waxzce
 */
public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
        return (username.equals("azerty") && password.equals("azerty"));
    }
    
}
