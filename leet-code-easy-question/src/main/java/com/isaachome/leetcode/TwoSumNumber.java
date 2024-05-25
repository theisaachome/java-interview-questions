package com.isaachome.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class TwoSumNumber
{
    public static void main( String[] args ) {
        var results =twoNumberSum(new int[]{3,5,-4,11,1,-1,6},10);
        Arrays.stream(results).forEach(System.out::print);
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
         for(int i=0; i<array.length;i++){
             int firstNum=array[i];
             for(int j=i+1; j<array.length ;j++){
                 int secondNum =array[j];
                 if(firstNum+secondNum==targetSum){
                     return new int[]{firstNum,secondNum};
                 }
             }
         }
         return new int[0];
    }
    // hashTable y=x-target x is number from array
    public static  int[] twoNumberSumHashTable(int[] array, int target){
        // create hashtable
        Set<Integer> nums = new HashSet<>();
        for(int num:array){
            int potentialNum = target-num;
            if(nums.contains(potentialNum)){
                return  new int[]{potentialNum,num};
            }else {
                 nums.add(num);
            }
        }

        return  new int[0];
    }

}
