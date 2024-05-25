package com.isaachome.arrays;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {
 fizzBuzz(15);
    }
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
           // print i
            else {
                System.out.println(i);
            }
        }

    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        int count=0;
        for(String s:queries){
            if(stringList.contains(s)){
                count++;
            }
            ans.add(count);
        }
        return ans;

    }
}
