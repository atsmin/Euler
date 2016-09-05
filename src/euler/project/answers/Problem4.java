package euler.project.answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

public class Problem4 {
    public static void main(String args[]){
        Problem4 promlem4 = new Problem4();
        final int N = 3;
        System.out.print(promlem4.solve(N));
    }
    
    public List<Integer> solve(int N) {
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
        return Arrays.asList(Iterables.getLast(palindromes));
        
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
