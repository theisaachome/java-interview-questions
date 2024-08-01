package com.isaachome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    private final ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    void test (){
        int [] heights = {1,7,2,5,4,7,3,6};
        assertEquals(36, container.maxArea(heights));
    }

    @Test
    void testII (){
        int [] heights = {2,2,2};
        assertEquals(4, container.maxArea(heights));
    }
    @Test
    void testIII (){
        int [] heights = {2,4};
        assertEquals(2, container.maxArea(heights));
    }

    @Test
    void testVI (){
        int [] heights = {2};
        assertEquals(0, container.maxArea(heights));
    }
}