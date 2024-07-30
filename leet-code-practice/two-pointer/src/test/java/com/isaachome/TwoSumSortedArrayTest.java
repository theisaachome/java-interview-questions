package com.isaachome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSortedArrayTest {

    private final TwoSumSortedArray twoSumSortedArray = new TwoSumSortedArray();

    @Test
    void test(){
        var nums = new int[]{1,2,3,4};
        var target =3;
         var result=twoSumSortedArray.findTwoSum(nums,target);
         assertArrayEquals(new int[]{1,2},result);
    }

}