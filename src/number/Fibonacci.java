package number;

public class Fibonacci {

    /*
        Fibonacci

        Create a method that will give you the Nth Fibonacci number where N is the given int parameter.
        Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
    Note: Fibonacci numbers are read like index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        parameter: int
        return: int

        Ex:
            input:
                8
            output:
                21

            -> ex of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21
    */

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        System.out.println(fib(8));
    }

    public static int fibonacci(int n){
        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++){
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    public static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }


}
