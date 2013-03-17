/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;
import java.util.*;

/**
 * @Author chen qian
 * @Edit Time 1:33:23 PM
 */
public class Hash_Map {
    public static Integer buildMap(String str){
          HashMap<Character, Boolean> table = new HashMap<Character , Boolean>();
    int ret =0;
    for(char c : str.toCharArray()){
        if(!table.containsKey(c)){
            table.put(c,true);
        } else if (table.get(c)){
            ++ret;
            table.put(c,false);
        }          
    }
    return ret;
    }

}
