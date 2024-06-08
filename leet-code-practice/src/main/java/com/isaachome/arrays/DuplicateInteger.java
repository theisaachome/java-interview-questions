package com.isaachome.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateInteger {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2,3,4,5,6,7,8,8}));
    }
    static boolean hasDuplicate(int [] nums){
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            if (!uniqueSet.add(num)) return true;
        }
        return false;
    }
    static int findDuplicate(int [] nums){
       Set<Integer> uniqueNum = new HashSet<>();
       for(int num:nums){
           if(uniqueNum.contains(num)){
               return num;
           }else {
               uniqueNum.add(num);
           }
       }

        return -1;
    }
}
