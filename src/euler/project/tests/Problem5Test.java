package euler.project.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import euler.project.answers.Problem5;

public class Problem5Test {

    @Test
    public void test() {
        Problem5 problem5 = new Problem5();
        final int N = 10;
        int result = problem5.solve(N);
        int expected = 2520;
        assertEquals(result, expected);
    }

}
