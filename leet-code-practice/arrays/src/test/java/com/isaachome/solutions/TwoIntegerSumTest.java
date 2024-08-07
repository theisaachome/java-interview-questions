package com.isaachome.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoIntegerSumTest {

    private TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
    @Test
    void test (){
        var nums=new int []{3,4,5,6};
        int target=7;
        System.out.println(twoIntegerSum.towSum(nums,target).toString());
    }

}