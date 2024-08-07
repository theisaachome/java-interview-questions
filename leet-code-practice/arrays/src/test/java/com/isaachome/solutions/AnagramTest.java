package com.isaachome.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram anagram = new Anagram();

    @Test
    void testI(){
      String s = "racecar", t = "carrace";
      assertTrue(anagram.isAnagram(s, t));
    }
    @Test
    void testIII(){
        String s = "jar", t = "jam";
        assertEquals(false,anagram.isAnagram(s, t));
    }
    @Test
    void testVI(){

        String s = "jar", t = "jar";
        assertTrue(anagram.isAnagramII(s, t));
        assertEquals(true,anagram.isAnagramII(s,t));
    }
    @Test
    void testV(){

        String s = "care", t = "race";
        assertEquals(true,anagram.isAnagramII(s,t));
    }

}