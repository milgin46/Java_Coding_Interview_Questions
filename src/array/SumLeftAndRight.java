package array;

import java.util.Arrays;

public class SumLeftAndRight {
    /*
        Sum Left and Right

        Create a method that will return an element from that array. The element it should return is the middle point where the sum of elements on its left and equal to the sum of elements on its right.

        Assume there is always a single valid element in the array values

        Ex:
            Input:
                [4, 9, 1, 3, 6, 4]
            Output:
                1

                -> 1 is the element returned because the left sum = 4 + 9
                is equal to the right sum = 3 + 6 + 4

        Ex:
            Input:
                [1, 2, 3, 4, 100, 10]
            Output:
                100

                -> 100 is the element returned because the left sum = 1 + 2 + 3 + 4
                is equal to the right sum = 10

     */

    public static void main(String[] args) {
        System.out.println(sumLeftRight(1, 2, 3, 4, 100, 10));
        System.out.println(sumLeftRight(9, 1, 10, 90, 15, 5));

        System.out.println(sumLeftRight2(1, 2, 3, 4, 100, 10));
    }

    public static int sumLeftRight(int... arr){

        for(int i = 1; i < arr.length -1; i++){ // go through all elements

            int left = 0;
            int right = 0;

            for(int j = 0; j < arr.length; j++){ // add the left and right parts
                if(j < i){
                    left += arr[j];
                } else if(j > i){
                    right += arr[j];
                }
            }

            if(left == right){
                return arr[i];
            }

        }
        return 0;
    }

    public static int sumLeftRight2(int... arr){ //  [1, 2, 3, 4, 100, 10]

        for(int i = 1; i < arr.length - 1; i++){

            int[] left = Arrays.copyOfRange(arr, 0, i);
            int[] right = Arrays.copyOfRange(arr, i+1, arr.length);

            if(Arrays.stream(left).sum() == Arrays.stream(right).sum()){
                return arr[i];
            }
        }
        return 0;
    }


}
