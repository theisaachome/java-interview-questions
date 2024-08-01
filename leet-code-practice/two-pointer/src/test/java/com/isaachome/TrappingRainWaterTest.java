package com.isaachome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    private final TrappingRainWater t = new TrappingRainWater();
    @Test
    void test(){
        int [] height = {0,2,0,3,1,0,1,3,2,1};
        assertEquals(9, t.trap(height));
    }

    @Test
    void testII(){
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, t.trap(height));
    }

}