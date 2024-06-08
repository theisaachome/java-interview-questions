package com.isaachome.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSum {
    public static void main(String[] args) {
        Arrays.stream(findTwoSumII(new int[]{-1,-2,-3,-4,-5},-8)).forEach(System.out::print);
    }
    public  static  int[] findTwoSum(int[] nums, int target){
        if(nums.length<1){
            return new int[]{};
        }
        int left=0, right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[left]+nums[right]>target){
                right--;
            }else if(nums[left]+nums[right]<target) {
                left++;
            }else {
               return new int[]{left,right};
            }

        }
        return new int[]{};
    }
    public  static  int[] findTwoSumII(int[] nums, int target){
       // Sort Array
//        Arrays.sort(nums);
        // Step 2: Initialize two pointers
        int left = 0;
        int right = nums.length - 1;
        while (left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{};
    }
    public static  int[] findTwoSumHashMap(int [] nums, int target){
        Map<Integer,Integer> prevMap = new HashMap<>();
        // y = target-x
        for(int i=0;i<nums.length; i++){
            int y=target-nums[i];
            if(prevMap.containsKey(y)){
                return  new int[]{prevMap.get(y),i};
            }
            prevMap.put(nums[i],i);
        }
        return  new int[]{};
    }
}
