package array;

import java.util.Arrays;

public class FirstDuplicateElement {
    /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */
    public static void main(String[] args) {
        System.out.println(firstDup(3, 5, 1, 5, -1, 5, 3));
        System.out.println(firstDup(5, 1, 5, -1, 5, 3));
        System.out.println(firstDup(5, 1, -1, 3));
        System.out.println("------");
        System.out.println(firstDup2(5, 1, 5, -1, 5, 3));
    }
    public static int firstDup(int... arr){
        for(int i = 0; i < arr.length; i++){  // iterate through array
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }

    public static int firstDup2(int... arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr));

        }
        return 0;
    }

}
