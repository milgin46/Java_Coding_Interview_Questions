package array;

public class MinNumber {
    /*
        Min Number

        Create a method that will find and return the min number in an int array
            parameter: int[]
            return: int

        The min number is the smallest value in the array

        Ex:
            input:
                min(3, 5, 1, 5, -1, 5)
            output:
                -1
     */
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, -5, -1, 5};
        System.out.println(minNum(arr));
    }
    public static int minNum(int[] arr){
        int min = arr[0];
        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
}
