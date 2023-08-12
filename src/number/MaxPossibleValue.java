package number;

public class MaxPossibleValue {

    /*
        Maximum Possible Value

        Create a method that will return the maximum possible value of the given number N by inserting the digit '5' somewhere in the integer.

        > bounds of N: -8,000 - 8,000

        Ex:
            Given N = 268, the function should return 5268
            Given N = 670, the function should return 6750
            Given N = 0, the function should return 50
            Given N = -999, the function should return -5999
     */

    public static void main(String[] args) {
        System.out.println(biggestValue(268));
        System.out.println(biggestValue(670));
        System.out.println(biggestValue(0));
        System.out.println(biggestValue(-999));
        System.out.println(biggestValue(798));
    }

    public static int biggestValue(int n){  // 820 -> 8520

        boolean isPos = n >= 0;
        n = Math.abs(n);
        String strNum = String.valueOf(n);
        boolean added = false;

        for(int i = 0; i < strNum.length(); i++){

            int digit = Integer.parseInt(strNum.substring(i , i + 1));

            if((isPos && digit < 5) || (!isPos && digit > 5)){
                strNum = strNum.substring(0, i) + 5 + strNum.substring(i);
                added = true;
                break;
            }

        }

        if(!added){
            strNum = strNum + 5;
        }

        return Integer.parseInt(strNum) * (isPos ? 1 : -1);
    }

}
