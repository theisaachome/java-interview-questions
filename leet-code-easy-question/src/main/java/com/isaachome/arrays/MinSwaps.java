package com.isaachome.arrays;

import java.util.Arrays;

public class MinSwaps {
    public static void main(String[] args) {
        var result = minimumSwaps(new int[]{10,8,5,4 ,3 ,1 ,6,2});
        System.out.println(result);
    }
    static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        int n = arr.length;
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[arr[i] - 1] = i;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                int swapIndex = pos[i];
                pos[arr[i] - 1] = swapIndex;
                pos[i] = i;

                int temp = arr[swapIndex];
                arr[swapIndex] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        return swapCount;

    }
    static int minimumSwaps2(int[] arr) {
        int min_swips=0,index=0,temp;
        while (index < arr.length){
            if(arr[index] != index+1){
                temp=arr[index];
                arr[index]=arr[arr[index]-1];
                arr[temp-1]=temp;
                min_swips++;
            }else {
                index++;
            }
        }
        return  min_swips;

    }
}
