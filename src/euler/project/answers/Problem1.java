package euler.project.answers;

import java.util.stream.*;

public class Problem1 {
    public static void main(String args[]) {
        Problem1 problem1 = new Problem1();
        System.out.print(problem1.solve()); // 233168
    }
    public int solve() {
        int sum = IntStream.range(1,1000)
                      .filter(x -> x % 3 == 0 || x % 5 == 0)
                      .sum();
        return sum;
    }
}
