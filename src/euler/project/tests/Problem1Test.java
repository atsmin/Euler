package euler.project.tests;

import static org.junit.Assert.*;

import euler.project.answers.Problem1;

import org.junit.Test;

public class Problem1Test {

    @Test
    public void test() {
        Problem1 problem1 = new Problem1();
        int result = problem1.solve();
        int expected = 233168;
        assertEquals(result, expected);
    }

}
