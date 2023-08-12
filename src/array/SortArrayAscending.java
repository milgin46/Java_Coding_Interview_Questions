package array;

import java.util.Arrays;

public class SortArrayAscending {

    /*
        Sort Array Ascending

        Create a method that will sort the given array in ascending order (smallest to largest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [-1, 1, 1, 2, 3, 3, 4, 5, 6, 6, 8]

     */


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAscending(3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6)));
        //System.out.println(Arrays.toString(sortAscending(5, -3, -2, -10, 34, 100, 23, -25, 2310, 129, 128)));
    }

    public static int[] sortAscending(int... arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }


}
