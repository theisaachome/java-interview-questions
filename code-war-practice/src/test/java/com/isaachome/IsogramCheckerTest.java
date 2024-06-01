package com.isaachome;

import com.isaachome.arrays.IsogramChecker;
import org.junit.jupiter.api.Test;
import  static  org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsogramCheckerTest {

    @Test
    public  void FixTests(){
        assertTrue(IsogramChecker.isIsogram("Dermatoglyphics"));
        assertTrue(IsogramChecker.isIsogram("isogram"));
        assertEquals(false, IsogramChecker.isIsogram("moose"));
        assertEquals(false, IsogramChecker.isIsogram("isIsogram"));
        assertEquals(false, IsogramChecker.isIsogram("aba"));
        assertEquals(false, IsogramChecker.isIsogram("moOse"));
        assertEquals(true, IsogramChecker.isIsogram("thumbscrewjapingly"));
        assertEquals(true, IsogramChecker.isIsogram(""));
    }
}
