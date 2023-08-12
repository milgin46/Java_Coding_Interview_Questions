package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSet {
    /*
        Iterate a Set

        Create a program to iterate through a Set and print the values. The main focus here is to check your understanding of collection types and how Set is different from others

        Ex:
            input:
                 set: ["java", "selenium", "sql", "api"]
            output:
                java
                selenium
                sql
                api
     */

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(Arrays.asList("java", "selenium", "sql", "api"));

        for(String each : set){
            System.out.println(each);
        }

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        set.forEach(System.out::println);

    }

}
