package org.example;

public class BuySellStock {
    public static void main(String[] args) {
        int []nums = new int[]{7,1,5,3,6,4};
        int profit = buySellStock(nums);
        System.out.println("The maximum profit is : "+profit);
    }

    public static int buySellStock(int []prices){
        int l = 0;
        int r = 1;
        int maxP = 0;
        while (r <prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            }else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
