package array;

public class MaxNumber {
    /*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */
    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 10, -1, 5};
        System.out.println(maxNum(arr));
    }
    public static int maxNum(int[] arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}
