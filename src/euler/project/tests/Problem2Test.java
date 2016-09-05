package euler.project.tests;

import static org.junit.Assert.*;

import euler.project.answers.Problem2;

import org.junit.Test;

public class Problem2Test {

    @Test
    public void test() {
        Problem2 problem2 = new Problem2();
        int result = problem2.solve();
        int expected = 4613732;
        assertEquals(result, expected);
    }
}
