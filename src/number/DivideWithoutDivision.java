package number;

public class DivideWithoutDivision {
    /*
    Divide Without Division

    Create a method to divide two numbers without using the division operator.
    Display the division value as well as any remainder
        parameter: int, int
        return: void

    output format: num1 / num2 is resultValue with remainder $remainderValue

    edge cases:
        cannot divide by 0

    Ex:
        input: 6, 2
        output: 6 / 2 is 3 with remainder 0
    Test data:
        6, 2 -> 6 / 2 is 3 with remainder 0
        7, 2 -> 7 / 2 is 3 with remainder 1
        8, 3 -> 8 / 3 is 2 with remainder 2
        7, 0 -> Cannot divide by 0
        3, 5 -> 3 / 5 is 0 with remainder 3

 */
    public static void main(String[] args) {
        divide(6, 2);
        divide(7, 2);
        divide(8, 3);

    }

    public static void divide(int n1, int n2) { // 6, 2 -> 4 -> 2 - > 0

        if (n2 == 0) {
            System.out.println("CANNOT DIVIDE BY ZERO");
            return;
        }

        int count = 0;
        String result = n1 + " / " + n2 + " is ";

        while (n1 >= n2) {
            count++;
            n1 -= n2;
        }

        System.out.println(result + count + " with remainder " + n1);

    }

}
