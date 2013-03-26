/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Author chen qian @Edit Time 11:46:59 AM
 */
public class LongestPalindromicSubstring {

    public static String expandAroundCenter(String s, int c1, int c2) {
        int l = c1, r = c2;
        int Z = s.length();
        while (l >= 0 && r <= Z - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r );
    }

    public static String longestPalindromeSimple(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        String longest = s.substring(0, 1);  // a single char itself is a palindrome
        for (int i = 0; i < n - 1; i++) {
            String p1 = expandAroundCenter(s, i, i);
            if (p1.length() > longest.length()) {
                longest = p1;
            }

            String p2 = expandAroundCenter(s, i, i + 1);
            if (p2.length() > longest.length()) {
                longest = p2;
            }
        }
        return longest;
    }

    public static String longestPalindromeDP(String s) {
        int n = s.length();
        int longestBegin = 0;
        int maxLen = 1;
        int[][] table = new int[5000][5000];
        //Arrays.fill(table, false);
        for (int i = 0; i < n; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                table[i][i + 1] = 1;
                longestBegin = i;
                maxLen = 2;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && table[i + 1][j - 1] ==1) {
                    table[i][j] = 1;
                    longestBegin = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(longestBegin, maxLen+longestBegin);
    }

    public static void main(String[] args) throws IOException {
//        String filename = "C:\\Users\\chen qian\\Desktop\\File.txt";
//        StringBuilder sb = new StringBuilder();
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(filename));
//
//            while (true) {
//                String line = reader.readLine();
//                sb.append(line);
//                if (line == null) {
//                    break;
//                }
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
        String result = longestPalindromeDP(new String("aaaabbbbccccc"));
        String result2 = longestPalindromeSimple(new String("abcdcba"));
        System.out.println(result+" --- "+ result2);
    }
}
