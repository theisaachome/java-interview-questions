package com.isaachome.arrays;

public class ContainerWithMaxWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,7,2,5,4,7,3,6}));
    }
    public static int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int res=0;
        while (left< right){
            int length=right-left;
            int maxArea = Math.min(heights[left],heights[right]) * length;
            res = Math.max(res,maxArea);
            if(heights[left] < heights[right]){
                left++;
            }else {
                right--;
            }
        }
      return res;
    }
}
