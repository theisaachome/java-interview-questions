package com.isaachome;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SquaredSortedArray {
    public static void main(String[] args) {
      var result= sortedSquaredArray2(new int[]{ -3, -2, -1});
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
    public static int[] sortedSquaredArray2(int[] array) {
        // Write your code here.
        int[] sortedArray =new int[array.length];
        for(int i=0; i<array.length ;i++){
            sortedArray[i]=array[i]*array[i];
        }
        return Arrays.stream(sortedArray).sorted().toArray();
    }
}
