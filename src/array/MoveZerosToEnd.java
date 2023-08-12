package array;

import java.util.Arrays;

public class MoveZerosToEnd {
    /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(5, 0, 2, 0, 20, 0, 6,  0, 1, 0, 23)));
    }
    public static int[] moveZeros(int... nums){

        int[] moved = new int[nums.length];
        int index = 0; // 1

        for(int each : nums){ //  [5, 2, 1, 23, 0, 0, 0, 0]
            if(each != 0){
                moved[index++] = each;
            }
        }

        return moved;
    }

}
