package com.isaachome.hacker;

import java.util.*;

public class TripletComparision {
    public static void main(String[] args) {
        compare(List.of(1, 2, 3,4),List.of(3, 2, 1,5)).forEach(System.out::print);
    }
    static List<Integer> compare(List<Integer> a,List<Integer>b){
        int alicePoints=0;
        int bobPoints=0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<b.size();i++){
            if(a.get(i) >b.get(i)){
                alicePoints++;
            } else if (a.get(i) < b.get(i) ) {
                bobPoints++;
            }
        }
        result.add(alicePoints);
        result.add(bobPoints);
        return result;
    }
}
