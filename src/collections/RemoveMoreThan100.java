package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveMoreThan100 {
    /*
        Remove More Than 100

        Create a method that will accept an Integer List and return the List with any value greater than 100 removed
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                removeMoreThan100(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823)
            output:
                [50, 24, 29, -255, 87, 99]

     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823));
        System.out.println(removeMoreThan100(nums));

    }

    public static List<Integer> removeMoreThan100(List<Integer> nums){

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            if(it.next() > 100){
                it.remove();
            }
        }
        return nums;
    }

    // removeIf(p -> p > 100)

}
