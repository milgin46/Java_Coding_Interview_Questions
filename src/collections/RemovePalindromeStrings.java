package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromeStrings {
    /*
        Remove Palindrome Strings

        Create a method that will accept a List of Strings and return the List with all palindrome Strings removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removePalindrome("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop")
            output:
                [hello, java, house, you]

     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop"));
        System.out.println(removePalindrome(list));
    }

    public static List<String> removePalindrome(List<String> list){

        Iterator<String> it = list.iterator(); // javj
        while(it.hasNext()){

            String element = it.next();
            boolean isPalindrome = true;

            for(int i = 0; i < element.length()/2; i++){
                if(element.charAt(i) != element.charAt(element.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome){
                it.remove();
            }

        }
        return list;
    }



}
