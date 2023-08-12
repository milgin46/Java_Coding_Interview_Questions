package array;

public class SecondLargestNumber {

    /*
        Second Largest Number

        Create a method that finds the second largest number in the given array. The second largest must be different from the largest number.

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                5

     */

    public static void main(String[] args) {
        System.out.println(secondLargest(3, 4, 5, 1, 2, 6));
        System.out.println(secondLargest(3, 4, 5, 1, 12, 6));
        System.out.println(secondLargest(20, 1, 4, 1, 4, 9));
    }

    public static int secondLargest(int... arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int each : arr){

            if(each > max){
                secondMax = max;
                max = each;
            } else if(each > secondMax){
                secondMax = each;
            }

        }

        return secondMax;
    }

}
