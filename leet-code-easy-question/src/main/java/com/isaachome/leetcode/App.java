package com.isaachome.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        int[] numbers1 = {2, 7, 11, 15};
//        int target1 = 9;
//        int[] result1 = towSum(numbers1, target1);
//        System.out.println("[" + result1[0] + ", " + result1[1] + "]");  // Output: [1, 2]
//
//        int[] numbers2 = {2, 3, 4};
//        int target2 = 6;
//        int[] result2 = towSum(numbers2, target2);
//        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

            int[][] arr = { { 1, 2,3,4 }, { 3, 4 },{ 3, 4 },{ 3, 4 },{ 3, 4 } };

            System.out.println("arr[0][0] = " + arr[0][2]);

    }
    public  static  int nonConstructibleChange(int [] coins){
        Arrays.sort(coins); // sort coin array
        int currentChange=0;
        for(int coin:coins){
            if(coin > currentChange+1){  // 4>(2+1)
                return  currentChange+1;
            }else {
                currentChange +=coin;
            }
        }
        return currentChange+1;
    }
    public  static  int [] towSum(int [] numbs,int k){
        int left=0;
        int right=numbs.length-1;
        while(left<right){
           int sum = numbs[left]+numbs[right];
           if(sum==k){
               return  new int[]{left,right};
           }else if(sum<k){
               left++;
           }else {
               right--;
           }
        }
        return new int[]{};
    }
}
