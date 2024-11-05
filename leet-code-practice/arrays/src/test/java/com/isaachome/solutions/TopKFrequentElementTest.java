package com.isaachome.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementTest {
    private final TopKFrequentElement frequentElement = new TopKFrequentElement();

    @Test
    void test(){
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] res = {1, 2};
        assertArrayEquals(res, frequentElement.topKFrequentWithBucketPractice(arr,k));
    }
    @Test
    void testII(){
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = 2;

        int[] res = {1, 2, 3};
        assertArrayEquals(res, frequentElement.topKFrequentWithBucketPractice(arr,k));
    }

}