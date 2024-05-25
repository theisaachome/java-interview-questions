package com.isaachome.hacker;

import java.util.List;
import java.util.Map;

public class DiagonalDifference {
    public static void main(String[] args) {

        var result =diagonalDifference(List.of(
                List.of(1 ,2 ,3),
                List.of(1 ,5 ,6),
                List.of(9 ,8 ,9)));
        System.out.println(result);
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
//        1 2 3
//        4 5 6
//        9 8 9
        // Write your code here
        int rightSum=0;
        int leftSum=0;
        int n = arr.size();
       for(int i=0;i<n;i++){
           rightSum +=arr.get(i).get(i);
           leftSum +=arr.get(i).get(n-1-i);
       }
       return Math.abs(rightSum-leftSum);

    }
}
