package com.isaachome.solutions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
    public boolean isDuplicate(int[] num) {
        Set<Integer> set = new HashSet<>();
        for(int i : num) {
            if(set.contains(i)) {
                return true;
            }else {
                set.add(i);
            }
        }
        return false;
    }
    public boolean isDuplicateII(int[] num) {
        Set<Integer> set = new HashSet<>();
        for(int i : num) {
            if(!set.add(i))return true;
        }
        return false;
    }
}
