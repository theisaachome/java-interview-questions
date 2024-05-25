package com.isaachome.arrays;

import java.util.List;

public class RiverQ3 {
    public static void main(String[] args) {

        System.out.println(maxTrailing(List.of(5,3,6,7,4)));
        System.out.println(maxTrailing(List.of(4,3,2,1)));
    }
    public static int maxTrailing(List<Integer> arr) {
        // Write your code here
        int maxDiff=-1;
        int minVal = arr.get(0);
        for(int currentNum:arr){
            if(currentNum > minVal){
                maxDiff=Math.max(maxDiff,currentNum-minVal);
            }
            minVal = Math.min(minVal,currentNum);
        }
        return maxDiff;

    }
}
