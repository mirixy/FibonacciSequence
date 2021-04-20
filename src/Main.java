public class Main {
    private static long fibonacci(int n) {
        /* Declare an array to store Fibonacci numbers. */
        long[] fibonacci = new long[n+2]; // 1 extra to handle case, n = 0
        /* 0th and 1st number of the series are 0 and 1 */
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            /* Add the previous 2 numbers in the series
                and store it.
             */
            fibonacci[i] = fibonacci[i-1] + fibonacci[i - 2];

        }
        return fibonacci[n];

    }
    public static void main (String[] args){

        for (int n = 0; n <= 50; n++){

            System.out.println(fibonacci(n));
        }


    }

}
