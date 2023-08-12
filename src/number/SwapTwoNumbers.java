package number;

public class SwapTwoNumbers {
    /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        a = a + b; // 14
        b = a - b; // 4
        a = a - b;

        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}
