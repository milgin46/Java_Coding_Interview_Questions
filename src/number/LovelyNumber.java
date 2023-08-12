package number;

import java.util.*;

public class LovelyNumber {
    /*
        Lovely Number

        Create a method that will count the lovely numbers with the given range. The parameters a and b are defined as the lower and upper bounds.
        A number is lovely if it contains fewer than three instances of any distinct digit

        Example of lovely numbers: 0, 100, 1232 and 9922
        Example of non-lovely numbers: 1000 (contains three copies of digit '0'), 33533 (contains four copies of digit '3').

        parameter: int, int
            A and B will be within the range: 0 - 100,000
        return: int

        Ex:
            Given A = 0, B = 0, your function should return 1, because o is
        lovely.

            Given A = 1, B = 111, your function should return 110, because
        the only integer in the range [1..111] that is not lovely is 111.

            Given A = 100000, B = 100000, your function should return 0,
        because 100000 is not lovely.
     */

    public static void main(String[] args) {
        System.out.println(loveyNumbers(0, 0));
        System.out.println(loveyNumbers(1, 111));
        System.out.println(loveyNumbers(100000, 100000));
        System.out.println(loveyNumbers(1, 3000));
    }

    public static int loveyNumbers(int a, int b){

        int count = 0;

        for(int i = a; i <= b; i++){ // i = 351 -> "351" -> ["3", "5", "1"]
            // 1000 -> [1, 0, 0 , 0]

            List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(i).split("")));
            int before = list.size();
            list.removeIf(p -> Collections.frequency(list, p) >= 3);

            if(list.size() == before){
                count++;
            }

        }

        return count;
    }

}
