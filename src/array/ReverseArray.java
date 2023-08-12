package array;

import java.util.Arrays;

public class ReverseArray {
    /*
        Reverse Array

        Create a method that will reverse the given array

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                [6, 2, 1, 5, 4, 3]

     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(3, 4, 5, 1, 2, 6)));
        System.out.println(Arrays.toString(reverse(4, 5, 2, 5, 2, 1, 10)));
    }

    public static int[] reverse(int... arr){

        for(int b = 0, e = arr.length - 1; b < arr.length / 2; b++, e--){ // b - indexes from the beginning | e - indexes from the end
            int temp = arr[b];
            arr[b] = arr[e];
            arr[e] = temp;
        }

        return arr;
    }
}
