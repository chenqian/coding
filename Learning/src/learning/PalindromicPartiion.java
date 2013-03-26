/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

import java.util.ArrayList;

/**
 * @Author chen qian @Edit Time 10:39:12 PM
 */
public class PalindromicPartiion {

    public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>> allResults = new ArrayList<ArrayList<String>>();
        if (s == null) {
            return allResults;
        }

        allResults = this.dfs(s);

        return allResults;
    }

    public ArrayList<ArrayList<String>> dfs(String s) {
        ArrayList<ArrayList<String>> results = new ArrayList<>();

        if (s.length() == 1) {
            results.add(new ArrayList<String>());
            results.get(0).add(s);
            return results;
        }

        if (s.length() == 0) {
            results.add(new ArrayList<String>());
            return results;
        }

        for (int i = 1; i <= s.length(); i++) {
            if (this.IsPalindrome(s.substring(0, i))) {
                ArrayList<ArrayList<String>> resultsTmp = this.dfs(s.substring(i));
                for (ArrayList<String> result : resultsTmp) {
                    result.add(0, s.substring(0, i));
                    results.add(result);
                }
            }
        }

        return results;
    }

    public Boolean IsPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;
    }
}
