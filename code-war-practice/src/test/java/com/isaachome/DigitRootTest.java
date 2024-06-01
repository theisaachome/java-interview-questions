package com.isaachome;


import com.isaachome.arrays.DigitalRoot;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DigitRootTest {

    @Test
    public void test1(){
        assertEquals(7, DigitalRoot.digitalRoot(16));
    }

}
