package number;

public class SumDigitsUntilOne {
        /*
        Sum All Digits Until One Digit

        Create a method to calculate the sum of all the digits until there is only one digit left. The sum becomes the next number
            parameter: int
            return: int

        Ex:
        input: 45659
        output:
                2

        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2

        Test data
            45659 -> 29 -> 11 -> 2
            3244 -> 13 -> 4
            24536 -> 20 -> 2

     */

    public static void main(String[] args) {
        System.out.println(sumDigitUntilOne(45659));
        System.out.println(sumDigitUntilOne(3244));
        System.out.println(sumDigitUntilOne(24536));
    }

    public static int sumDigitUntilOne(int n){ //  45659

        while(n/10 != 0){

            int sum = 0;

            while(n != 0){
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        return n;
    }

}
