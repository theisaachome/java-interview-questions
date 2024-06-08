package com.isaachome.arrays;

import java.util.*;

public class TopKElementInList {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,1, 2, 2, 3, 3, 3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1))); // Output: [2, 3]

        int[] nums2 = {7, 7};
        int k2 = 1;
        System.out.println(Arrays.toString(topKFrequent(nums2, k2))); // Output: [7]

    }
    public static int[] findTopKElementI(int [] nums,int k){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int i:nums){
            frequencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap
                = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // Step 3: Extract the elements from the min-heap
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }

        return result;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        // assign empty arrayList for each bucket
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int counter = 0;
        for (int i = bucket.length - 1; i > 0 && counter < k; i--) {
           if(bucket[i]!=null){
               for(Integer integer:bucket[i]){
                   res[counter++]=integer;
               }
           }
        }
        return res;
    }
}
