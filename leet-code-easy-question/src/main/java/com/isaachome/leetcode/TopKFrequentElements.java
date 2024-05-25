package com.isaachome.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public  static List<Integer> topKFrequent(int []nums, int k){
        // Step 1: Count the frequency of each element using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) +1);
        }
        frequencyMap.entrySet().forEach(System.out::println);
        return null;

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println(topKFrequent(nums1, k1)); // Output: [1, 2]

//        int[] nums2 = {1};
//        int k2 = 1;
//        System.out.println(topKFrequent(nums2, k2)); // Output: [1]
//
//        int[] nums3 = {1, 4, 4, 5, 5, 5};
//        int k3 = 2;
//        System.out.println(topKFrequent(nums3, k3));
    }
}
