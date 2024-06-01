package com.isaachome.twopointers;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        System.out.println("Number of pairs with sum less than " + 7 + ": " + countPairsWithList(Arrays.asList(1, 3, 5, 2, 4, 6), 7));

//        int [] nums = {1,3,5,2,4,6};
//        int target=7;
//        System.out.println(countPairs(nums,target));
    }

    public static  int countPairs(int [] arr,int target){
        //sort the Array
        Arrays.sort(arr);
        int left=0, right=arr.length-1;
        int count =0;
        while (left<right){
            if (arr[left] + arr[right]< target) {
                count+=(right-left);
                left++;
            }else {
                right--;
            }
        }
        return count;
    }
    public static  int countPairsWithList(List<Integer>arr, int target){
        //sort the Array
        Collections.sort(arr);
        int left=0, right=arr.size()-1;
        int count =0;
        while (left<right){
            if ((arr.get(left) + arr.get(right))< target) {
                count+=(right-left);
                left++;
            }else {
                right--;
            }
        }
        return count;
    }

}
