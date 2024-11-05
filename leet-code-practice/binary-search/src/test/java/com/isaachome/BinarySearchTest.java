package com.isaachome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();
    @Test
    void test(){
        var arr = new int[]{-1,0,2,4,6,8};
        int target = 4;
        assertEquals(3, binarySearch.search(arr, target));
    }


}