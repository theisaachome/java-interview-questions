package com.isaachome;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SquaredSortedArray {
    public static void main(String[] args) {
      var result= sortedSquaredArray(new int[]{ 1, 2, 3, 5, 6, 8, 9});
        Arrays.stream(result).forEach(System.out::print);
    }
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] sortedArray =new int[array.length];
        int firstIdx=0;
        int lastIdx= array.length-1;
        for(int i=lastIdx;i>=0;i--){
            if(abs(array[firstIdx]) > abs(array[lastIdx])){
                sortedArray[i]=array[firstIdx]*array[firstIdx];
                firstIdx++;
            }else {
                sortedArray[i]=array[lastIdx]* array[lastIdx];
                lastIdx--;
            }
        }
        return sortedArray;
    }
}
