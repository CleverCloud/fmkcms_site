/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.java.util;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author waxzce
 */
public class LocaleField {

    public static Locale process(String value) {
        List<String> s = Arrays.asList(value.split("_"));
        switch (s.size()) {
            case 1:
                return new Locale(s.get(0));
            case 2:
                return new Locale(s.get(0), s.get(1));
            case 3:
                return new Locale(s.get(0), s.get(1), s.get(2));
        }
        return null;
    }
}
