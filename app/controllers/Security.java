/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.secureStuff.SecureConstants;

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

    static boolean check(String profile) {
        System.out.println(profile);
        if(profile.equals(SecureConstants.READ_PAGE)){
            return true;
        }else{
            return false;
        }
    }
}
