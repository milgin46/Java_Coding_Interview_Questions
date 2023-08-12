package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMoveAllZerosToEnd {
    /*
        Move All Zeros To The End

        Create a method that will accept an Integer List and return the List with all the zero elements moved to the end
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                moveZeros(5, 0, 0, 1, 4, 0, 14, 1)
            output:
                [5, 1, 4, 14, 1, 0, 0, 0]

     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 50, 5, 0, 0, 1, 4, 0, 14, 1));
        System.out.println(moveZeros(list));
    }
    public static List<Integer> moveZeros(List<Integer> list){
        int originalSize = list.size();
        list.removeIf(p -> p == 0);
        int numOfZeros = originalSize - list.size();

        for(int i = 0; i < numOfZeros; i++){
            list.add(0);
        }

        return list;
    }


}
