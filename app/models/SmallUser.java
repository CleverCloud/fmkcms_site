/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;
import models.secure.UserHaveRoles;

/**
 *
 * @author waxzce
 */
public class SmallUser implements UserHaveRoles{

    public String name = "John DOE";

    public List<String> getRoles() {
        List<String> ls = new ArrayList<String>();
        ls.add("admin");
        return ls;
    }
}
