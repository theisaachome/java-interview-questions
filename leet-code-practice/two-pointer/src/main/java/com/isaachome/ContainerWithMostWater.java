package com.isaachome;

public class ContainerWithMostWater {
    public  int maxArea(int[] height) {
        if(height.length <2) return 0;
        int left=0,right=height.length-1;
        int max=0;
        while(left<right){
            int length = right-left;
            int area = Math.min(height[left],height[right]) * length;
            max = Math.max(max,area);
            if(height[left] < height[right]){left++;}else {right--;}
        }
        return max;
    }
}
