package com.isaachome.arrays;

import java.util.Arrays;

public class ProductsOfArrayDiscludingSelf {
    public static void main(String[] args) {
//        System.out.println();
       var result= productExceptSelf(new int[]{1,2,4,6});
       Arrays.stream(result).forEach(System.out::print);
    }

    public static int[] productExceptSelf(int[] nums) {
        //    i = [0,1,2,3,4,5]
        //  num = [1,2,4,6]
        // left = [1,]
        // i =2,
        // right[2] = right[2+1]=1 * nums[2+1]=6
        // i =1,
        // right[1] = right[1+1]=6 * nums[1+1]=4  => 24
        // i =0,
        // right[0] = right[0+1]=24 * nums[0+1]=2  => 48

        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int [] ans = new int[nums.length];

        right[nums.length-1]=1;
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i] =left[i-1] * nums[i-1];
        }
        for (int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1] * nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i] = left[i]*right[i];
        }
        return  ans;
    }

        public int[] productExceptSelfII(int[] nums) {
            int[] arr = new int[nums.length];
            int right = 1, left = 1;
            for (int i = 0; i < nums.length; i++) {
                arr[i] = left;
                left *= nums[i];
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                arr[i] *= right;
                right *= nums[i];
            }
            return arr;
        }


}
