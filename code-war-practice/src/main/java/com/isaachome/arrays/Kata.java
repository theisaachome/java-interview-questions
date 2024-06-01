package com.isaachome.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
      int[] result=  arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2});
        Arrays.stream(result).forEach(System.out::print);

//        List<Integer> a = List.of(1, 2, 2, 2, 3);
//        List<Integer> b = List.of(2);
//        List<Integer> result = listDiff(a, b);
//        System.out.println(result);
    }
    public static int [] arrayDiff(int[] a,int []b){
        int aIndex=0;
        int bIndex=0;
        int [] diffArray=new int[a.length];
        for(int i=0;i<a.length;i++){
            aIndex++;
            System.out.println(a[aIndex]);
            System.out.println(b[bIndex]);
        }
        return diffArray;
    }
    public static List<Integer> listDiff(List<Integer> a, List<Integer>b){
       List<Integer> diffArray = new ArrayList<>();
       for(Integer ele:a){
           if(!b.contains(ele)){
               diffArray.add(ele);
           }
       }
        return diffArray;
    }
}
