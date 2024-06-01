package com.isaachome.arrays;

public class MaxDifference {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Maximum difference: " + maxDifference(nums1)); // Output: 8

        int[] nums2 = {7, 9, 5, 6, 3, 2};
        System.out.println("Maximum difference: " + maxDifference(nums2)); // Output: 2

        int[] nums3 = {1, 2, 90, 10, 110};
        System.out.println("Maximum difference: " + maxDifference(nums3)); // Output: 109
    }
    public static int maxDifference(int[] nums) {
        // Edge case: If the array has fewer than 2 elements, return 0
        if (nums.length < 2) {
            return 0;
        }

        // Initialize minimum element and max difference
        int minElement = nums[0];
        int maxDiff = nums[1] - nums[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update maxDiff if the current difference is larger
            maxDiff = Math.max(maxDiff, nums[i] - minElement);

            // Update minElement if the current element is smaller
            minElement = Math.max(minElement, nums[i]);
        }

        return maxDiff;
    }

}
