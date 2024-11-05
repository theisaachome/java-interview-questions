package com.isaachome.solutions;

import java.util.*;

public class TopKFrequentElement {

    public int[] topKFrequentWithBucket(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int n:nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n,0) + 1);
        }
        for(int key:frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int counter = 0;
        for(int pos= bucket.length - 1; pos >= 0 && counter <k; pos--){
            if(bucket[pos] != null){
                for(Integer key:bucket[pos]){
                    result[counter++] = key;
                }
            }
        }
        return result;
    }

    public int[] topKFrequentWithBucketPractice(int[] nums, int k) {
       // store the freq of number in Hash
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int n:nums){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0) + 1);
        }
        // use bucket algorithm to get the most frequency number store the key(a value from input arrays)
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int key:frequencyMap.keySet()){
           int frequency=  frequencyMap.get(key);
          if(bucket[frequency] == null){
              bucket[frequency] = new ArrayList<>();
          }
          bucket[frequency].add(key);
        }
        // retrieve bucket list from last  index.
        int[] result = new int[k];
        int counter = 0;
        for(int pos= bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos] != null){
                for(Integer value:bucket[pos]){
                    result[counter++] = value;
                }
            }
        }
        return  result;
    }
}
