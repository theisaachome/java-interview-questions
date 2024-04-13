package com.isaachome;

import java.util.Arrays;

public class NonConstructiableChange {
    public static void main(String[] args) {
        System.out.println(findNonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}));
    }

    public  static  int findNonConstructibleChange(int [] coins){
        if(coins.length==0){
            return  1;
        }
        Arrays.sort(coins);
        int currentChange = 0;
        for(int coin : coins){
            if(coin> currentChange +1){
                return  currentChange+1;
            }else {
                currentChange +=coin;
            }
        }
        return  currentChange+1;
    }
}
