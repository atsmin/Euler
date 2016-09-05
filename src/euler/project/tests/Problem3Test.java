package euler.project.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import euler.project.answers.Problem3;

public class Problem3Test {

    @Test
    public void test() {
        Problem3 problem3 = new Problem3();
        long result = problem3.solve();
        int expected = 6857;
        assertEquals(result, expected);
    }

}
