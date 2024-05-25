package com.isaachome.arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArrayLeftRotation {
    public static void main(String[] args) throws IOException {
        List<Integer> result = rotLeftWhileLoop(List.of(1 ,2, 3, 4, 5), 2);
        result.forEach(System.out::print);
        System.out.println();
        rotLeftWhileLoopII(Arrays.asList(1,2,3,4,5,6),4).forEach(System.out::print);
    }
    public static List<Integer> rotLeftForLoop(List<Integer> a, int d) {
        int n = a.size();
        // Write your code here
        Integer[] rotatedArray = new Integer[n];
        for(int i= 0;i<n;i++){
            int newIndex = (i + n - d) % n;
            rotatedArray[newIndex] = a.get(i);
        }
        // Convert the array back to a list
        return new ArrayList<>(Arrays.asList(rotatedArray));
    }
    public static List<Integer> rotLeftWhileLoop(List<Integer> a, int d) {
        int size = a.size();
        int i =0;
        int rotateIndex = d;
        Integer[] rotatedArray = new Integer[size];

        // Copy the elements from rotateIndex to the end of the list
        while (rotateIndex< size){
            rotatedArray[i]=a.get(rotateIndex);
            i++;
            rotateIndex++;
        }
        // Copy the elements from the beginning of the list to rotateIndex
        rotateIndex=0;
        while (rotateIndex<d){
            rotatedArray[i]=a.get(rotateIndex);
            i++;
            rotateIndex++;
        }
        // Convert the array back to a list
        return new ArrayList<>(Arrays.asList(rotatedArray));
    }

    public static List<Integer> rotLeftWhileLoopII(List<Integer> a, int d) {
        String s= "the-name-isaac";
        s.toLowerCase(Locale.ROOT);
       String result= s.replaceAll("-","N");
        System.out.println(result);
       // n=5, d=2
        int newIndex = d;
        List<Integer> rotatedArray = new ArrayList<>();
        while (newIndex<a.size()){
            rotatedArray.add(a.get(newIndex));
            // add new element start from index 2
            newIndex++;
        }
        newIndex=0;
        while (newIndex<d){
            rotatedArray.add(a.get(newIndex));
            newIndex++;
        }
        return  rotatedArray;
    }
}
