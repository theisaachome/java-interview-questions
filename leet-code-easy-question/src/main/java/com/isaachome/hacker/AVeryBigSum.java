package com.isaachome.hacker;

import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) {

    }
    static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0l;
        for(Long val:ar){
            sum+=val;
        }
        return sum;

    }
}
