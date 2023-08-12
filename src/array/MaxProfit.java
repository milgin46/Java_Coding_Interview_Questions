package array;

public class MaxProfit {
    /*
        Max Profit

        Given an array of stock prices on different days calculate the maximum profit you could make buying it on one day and selling oon another.

        It is only possible to buy or sell once on each day

        Ex:
            Input:
                [8,3,3,1,4,9,12,11]
            Output:
                11

                -> Buying on day 4 for $1 and selling on day 7 when it is worth $12 gives the maximum profit of $11
    */

    public static void main(String[] args) {
        System.out.println(maxProfit(8,3,3,1,4,9,12,11));
        System.out.println(maxProfit(6, 3, 5, 2, 6, 20, 10));
    }
    public static int maxProfit(int... nums){

        int maxProfit = 0;

        for(int i = 0; i < nums.length; i++){ // which day would you buy on

            for(int j = i + 1; j < nums.length; j++){ // which day would you sell on
                int profit = nums[j] - nums[i];

                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

}
