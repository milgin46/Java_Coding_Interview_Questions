package array;

import java.util.*;

public class FrequencyOfEachElement {
    /*
        Frequency Of Each Element

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {
        frequencyElement("Apple","Banana","Apple","Cherry", "Apple", "Cherry");
        freq("Apple","Banana","Apple","Cherry", "Apple", "Cherry");
    }

    public static void frequencyElement(String... arr){
        String result = "";
        for(String first : arr){
            int count = 0;

            if(!result.contains(first)) {
                for (String each : arr) {
                    if (first.equals(each)) {
                        count++;
                    }
                }

                result += first + " = " + count + "\n";
            }
        }

        System.out.println(result);
    }

    public static void freq(String... arr){
        Map<String, Integer> map = new HashMap<>();
        for(String each : arr){
            if(!map.containsKey(each)){
                map.put(each, 0);
            }

            map.put(each, map.get(each) + 1);
        }

        System.out.println(map);

        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }

    /*
            map {

            Apple = 3
            Banana = 1
            Cherry = 2
            }
     */

}
