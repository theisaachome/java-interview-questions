package com.isaachome.arrays;

import java.util.List;

public class NewYearChaos {
    public  static  void minimumBribes(List<Integer> q){
        int swaps = 0;

        for (int i = 0; i < q.size(); i++) {
            // If any person has moved more than two positions ahead, print "Too chaotic" and return
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        // Count the number of swaps required
        for (int i = q.size() - 1; i >= 0; i--) {
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    swaps++;
                }
            }
        }

        System.out.println(swaps);
    }
    public static void main(String[] args) {
         minimumBribes(List.of(2,5 ,1,3, 4));
    }
}
