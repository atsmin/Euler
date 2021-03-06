package euler.project.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import euler.project.answers.Problem4;
import org.junit.Test;


public class Problem4Test {

    @Test
    public void test() {
        Problem4 problem4 = new Problem4();
        final int N = 3;
        List<Integer> result = problem4.solve(N);
        Integer[] expected = {906609, 993, 913};
        assertTrue(Arrays.equals(result.toArray(), expected));
    }

}
