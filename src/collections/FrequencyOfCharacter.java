package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    /*
        Frequency of Character

        Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}
     */

    public static void main(String[] args) {
        frequencyOfCharacter("banana apple pie");
    }
    public static void frequencyOfCharacter(String str){

        Map<Character, Integer> counter = new LinkedHashMap<>(); // key - each char and the value - is the frequency

        for(int i = 0; i < str.length(); i++){
            char eachChar = str.charAt(i);

            if(!counter.containsKey(eachChar)){
                counter.put(eachChar, 0);
            }

            counter.put(eachChar, counter.get(eachChar) + 1);

        }

        System.out.println(counter);

    }

}
/*
   applep

    counter{
        a = 1

    }


 */