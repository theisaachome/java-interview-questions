package com.isaachome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void test(){
       var result= validPalindrome.isPalindrome("Was it a car or a cat I saw?");
       assertTrue(result);
    }
}