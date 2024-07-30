package com.isaachome;

public class TwoSumSortedArray {
    public  int[] findTwoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            // check if they are equal
            if(nums[left] + nums[right] == target) {
                return new int[]{left+1, right+1};
            }else if(nums[left] + nums[right] < target) {
                left++;
            }else {
                right--;
            }
        }
        return new int[0];
    }
}
