package com.isaachome.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        int longestStrike=0;
        for(int n:nums){
            numSet.add(n);
        }

        for(int num: numSet){
            if(!numSet.contains(num-1)){
                int length=1;
                while (numSet.contains(num+length)){
                    length++;
                }
                longestStrike = Math.max(longestStrike,length);
            }
        }
       return longestStrike;
    }
// P@$$4me4netflix
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums1)); // Output: 4

        int[] nums2 = {0, -1, 1, 2, -2, -3};
        System.out.println(longestConsecutive(nums2)); // Output: 4
    }
}
