public class Problem2 {
    public static void main(String args[]) {
        int f = 0; 
        int i = 1;
        int sum = 0;
        while (f <= 4E+6) {
            f = fib(i);
            if (f % 2 == 0) {
                sum += f;
            }
            i++;
        }
        System.out.print(sum);
    }
    
    static int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
