package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class TimeSeries {
    /*
        Time Series

        Create a method that will return the summation of the given time series. A time series will be a Map holding a time/value pair. Given two time series combine them together. When a time is matched in both series the values are combined
            parameter: Map<Integer, Double>
            return: Map<Integer, Double>

        Ex:
            input:
                 series A: {1=1.0, 2=1.5, 3=2.0}
                 series B: {2=1.0, 3=2.5, 5=1.0}
            output:
                 {1=1.0, 2=2.5, 3=4.5, 5=1.0}
     */

    public static void main(String[] args) {
        Map<Integer, Double> a = new LinkedHashMap<>();
        a.put(1, 1.0); a.put(2, 1.5); a.put(3, 2.0);

        Map<Integer, Double> b = new LinkedHashMap<>();
        b.put(2, 1.0); b.put(3, 2.5); b.put(5, 1.0);

        System.out.println(timeSeries(a, b));

    }
    public static Map<Integer, Double> timeSeries(Map<Integer, Double> seriesA, Map<Integer, Double> seriesB){
        Map<Integer, Double> sum = new LinkedHashMap<>(seriesA);

        for(int key : seriesB.keySet()){
            if(sum.containsKey(key)){
                sum.put(key, sum.get(key) + seriesB.get(key));
            } else {
                sum.put(key, seriesB.get(key));
            }
        }
        return sum;
    }

    // {1=1.0, 2=1.5, 3=2.0}
}
