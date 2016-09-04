package euler.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

public class Problem4 {
    public static void main(String args[]){
        final int N = 3;
        int start = Integer.parseInt(Strings.repeat("9", N));
        int limit = Integer.parseInt(Strings.repeat("9", N - 1));

        ArrayList<Integer[]> palindromes = new ArrayList<>();
        for (int i = start; i > limit; i--) {
            for (int j = i; j > limit; j--) {
                if (is_palindrome(i * j)) {
                   Integer[] result = {i * j, i, j};
                   palindromes.add(result);
                }
            }
        }
        Collections.sort(palindromes, new Comparator<Integer[]>() {
           @Override 
           public int compare(Integer[] a, Integer[] b) {
              return a[0] - b[0];
           }
        });
        System.out.println(
            Arrays.asList(Iterables.getLast(palindromes))
        );
    }
    public static boolean is_palindrome(Integer n) {
        String str = n.toString();
        int len = str.length();
        if (len % 2 != 0) {
           return false; 
        }
        int half = len / 2;
        String half1 = str.substring(0, half);
        String half2 = new StringBuffer(str.substring(half, len)).reverse().toString();
        if (half1.equals(half2)) {
           return true; 
        } else {
            return false;
        }
    }
}
