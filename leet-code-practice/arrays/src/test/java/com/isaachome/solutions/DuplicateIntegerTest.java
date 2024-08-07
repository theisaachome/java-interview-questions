package com.isaachome.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateIntegerTest {
    private final  DuplicateInteger duplicateInteger = new DuplicateInteger();
    @Test
    void testI(){
        int [] nums =new int []{1,2,3,3};
         var result =duplicateInteger.isDuplicate(nums);
         assertEquals(true,result );

    }
    @Test
    void testII(){
        int [] nums =new int []{1,2,3,4};
        var result =duplicateInteger.isDuplicate(nums);
        assertEquals(false,result );

    }
    @Test
    void testIII(){
        int [] nums =new int []{1,2,3,4,4};
        var result =duplicateInteger.isDuplicateII(nums);
        assertEquals(true,result );
    }

}