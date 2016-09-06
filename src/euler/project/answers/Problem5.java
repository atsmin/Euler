package euler.project.answers;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Problem5 {
    public static void main(String args[]) {
        Problem5 problem5 = new Problem5();
        int N = 10;
        System.out.print(problem5.solve(N));
    }

    public int solve(int N) {
        Iterator<Integer> counter = IntStream.iterate(1, x -> x + 1).iterator();
        while(true) {
            int count = counter.next();
            if (this.try_divide(N, count)) {
                return count;
            }         
        }
    }

    public boolean try_divide(int N, int num) {
        int quotient = IntStream.range(1, N)
                                .map(x -> num % x).sum();
        if (quotient == 0) {
           return true; 
        } else {
           return false;
        }
    }
}
