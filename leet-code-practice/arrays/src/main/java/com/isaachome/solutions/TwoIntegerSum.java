package com.isaachome.solutions;

public class TwoIntegerSum {
    public int[] towSum(int[] nums, int target) {
        int left =0,right=nums.length-1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if(sum==target)return  new int[]{left,right};
            if (sum > target) {
                right--;
            }else {
                left++;
            }
        }
        return new int[]{};
    }

}
