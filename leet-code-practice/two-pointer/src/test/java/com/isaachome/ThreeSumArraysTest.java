package com.isaachome;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumArraysTest {
    private final ThreeSumArrays obj = new ThreeSumArrays();

    @Test
    void testThreeSumI (){
        int[] nums = {-1,0,1,2,-1,-4};
       var results= obj.threeSum(nums);
       List<List<Integer>> expected = new ArrayList<>();
       var list1=List.of(-1,-1,2);
       var list2=List.of(-1,0,1);
       expected.addAll(Arrays.asList(list1,list2));
       assertEquals(expected,results);
    }
    @Test
    void testThreeSumII(){
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = new ArrayList<>();
        var result = obj.threeSum(nums);
        assertEquals(expected,result);
    }

    @Test
    void testThreeSumIII(){
        int[] nums = {0, 1};
        List<List<Integer>> expected = new ArrayList<>();
        var result = obj.threeSum(nums);
        assertEquals(expected,result);
    }
    @Test
    void testThreeSumIV(){
        int[] nums = {0, 0,0};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0,0));
        var result = obj.threeSum(nums);
        assertEquals(expected,result);
    }
}