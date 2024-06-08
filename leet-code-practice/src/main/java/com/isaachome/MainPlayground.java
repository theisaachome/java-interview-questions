package com.isaachome;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class MainPlayground {
    public static void main( String[] args ) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(hasDuplicate(nums1)); // Output: true
        System.out.println(hasDuplicate(nums2)); // Output: false
    }
    public static  boolean hasDuplicate(int [] nums){
       Set<Integer> uniques = new HashSet<>();
       for(int i:nums){
           if(uniques.contains(i))return true;
           uniques.add(i);
       }
       return false;
    }
}
