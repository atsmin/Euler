package euler.project.answers;

import java.util.ArrayList;
import com.google.common.collect.Iterables;

public class Problem3 {
    public static void main(String args[]) {
        Problem3 problem3 = new Problem3();
        System.out.print(problem3.solve());
    }
    
    public long solve() {
        long n = 600851475143L;
        PrimeCalculator calculator = new PrimeCalculator();
        ArrayList<Long> factors = calculator.prime_factors(n);
        return Iterables.getLast(factors);
    }
}

class PrimeCalculator {
    public ArrayList<Long> prime_factors(long n) {
        if (n < 2) {
            return new ArrayList<Long>();
        }
        ArrayList<Long> factors = new ArrayList<>();
        long p = 2;
        while (n > 1) {
            // if p * p is greater than n, there are no primes greater then p.
            if (p * p > n) {  
                break;
            }
            if (n % p == 0) {
                // divide n by p completely
                while (n % p == 0) {
                    n /= p;
                }
                factors.add(p);
            }
            p++;
        }
        if (n > 1) {
            factors.add((n));
        }
        return factors;
    }
}
