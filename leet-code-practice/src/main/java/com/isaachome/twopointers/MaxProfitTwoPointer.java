package com.isaachome.twopointers;

public class MaxProfitTwoPointer {
    public static void main(String[] args) {
        System.out.println(findMaxProfit(new int[]{10,1,5,6,7,1}));
    }
    public static int findMaxProfit(int []prices){
        int left=0,right=1;
        int maxProfit=0;
        int current=0;
        if(prices==null || prices.length==0)return 0;
        while (right<prices.length){
            if(prices[left] < prices[right]){
                 current=prices[right]-prices[left];
                maxProfit=Math.max(maxProfit,current);
            }else {
                left=right;
            }
            right++;
        }
        return maxProfit;
    }
}
