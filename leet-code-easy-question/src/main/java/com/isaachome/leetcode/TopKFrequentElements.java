package com.isaachome.leetcode;

import java.util.*;

public class TopKFrequentElements {

    public  static List<Integer> topKFrequent(int []nums, int k){
        // Step 1: Count the frequency of each element using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) +1);
        }
//        frequencyMap.entrySet().forEach(System.out::println);
//        return null;
        // Step 2: Use a PriorityQueue to keep track of top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 3: Extract the top k elements from the PriorityQueue
        List<Integer> topKElements = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topKElements.add(minHeap.poll().getKey());
        }

        // Since we want the elements in descending order of frequency, we reverse the list
        Collections.reverse(topKElements);
        return topKElements;

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println(topKFrequent(nums1, k1)); // Output: [1, 2]

//        int[] nums2 = {1};
//        int k2 = 1;
//        System.out.println(topKFrequent(nums2, k2)); // Output: [1]
//
        int[] nums3 = {1,1, 4, 4, 5, 5, 5,6,6,6,6,7,7,8,8,8,8};
        int k3 = 2;
        System.out.println(topKFrequent(nums3, k3));
    }
}
