package com.isaachome;

import java.util.*;

/**
 * Hello world!
 *
 */
public class MainPlayground {
    public static void main( String[] args ) {
        System.out.println(maxProfit(new int[]{10,8,7,5,2}));
    }
    public static int maxProfit(int[] prices) {
        // left=buy right=sell
        int left=0 ,right=1;
        int maxProfit=0;
        while (right< prices.length){
            // check the profit
            int currentProfit=0;
            if(prices[left] < prices[right]){
                    currentProfit = prices[right]-prices[left];
                    maxProfit=Math.max(maxProfit,currentProfit);
            }else {
                left=right;
            }
            right++;
        }
        return  maxProfit;
    }

}
