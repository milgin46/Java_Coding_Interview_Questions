package number;

public class Factorial {
    /*
    Factorial Number

    Create a method that will accept an int number and return the factorial of that number.
        parameter: int
        return: int

    A factorial number is the product of all the positive integers that come before that number. In math the factional is represented with an exclamation point

    -> 5 factional is: 5!

    Ex:
        input: 5
        output: 120

        -> all the positive numbers from the number, 5, are multiplied
            5! = 5 * 4 * 3 * 2 * 1
    Test data:
        5 -> 120
        6 -> 720
        8 -> 40320
 */
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(8));

        System.out.println(fact(5));
    }

    public static int factorial(int n) {

        int result = 1;

        while (n > 1) {
            result *= n--;
        }

        return result;
    }

    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

}
