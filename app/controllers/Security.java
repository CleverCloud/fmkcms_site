/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.secureStuff.SecureConstants;
import models.SmallUser;

/**
 *
 * @author waxzce
 */
public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
        if (username.equals("azerty") && password.equals("azerty")) {
            return true;
        } else {
            return false;
        }

    }

    
}
