package com.isaachome;

public class TrappingRainWater {
    public int trap(int[] height) {
        //base check
        if(height.length==0 || height==null)return 0;
        int left = 0, right = height.length - 1;
        int maxLeft = height[left], maxRight = height[right];
        int result=0;
        while(left<right){
          if(maxLeft < maxRight){
              left++;
              maxLeft = Math.max(maxLeft, height[left]);
              result += maxLeft - height[left];
          }else {
              right--;
              maxRight = Math.max(maxRight, height[right]);
              result += maxRight - height[right];
          }
        }
        return result;
    }
}
