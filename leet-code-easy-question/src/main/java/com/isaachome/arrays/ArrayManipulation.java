package com.isaachome.arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        int n = 5;

        // Creating the list of lists for the queries
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1, 2, 100));
        queries.add(Arrays.asList(2, 5, 100));
        queries.add(Arrays.asList(3, 4, 100));

        // Calling the method and printing the result
        long result = manipulateArrayWithList(n, queries);
        System.out.println(result);
    }
    static long manipulateArray(int n, int[][] queries){
        long maxVal=Long.MIN_VALUE;
        long [] result = new long[n];
        int length=queries.length;
        for(int i=0;i<length;i++){
            int startIndex = queries[0][i]-1;
            int endIndex =  queries[i][0]-1;
            int add =  queries[i][2];
            result[startIndex] +=add;
            if(endIndex+1 < n){
              result[endIndex+1]+=add;
            }
        }
        for(int i=1; i<n;i++){
            result[i] +=result[i-1];
            maxVal= Math.max(maxVal,result[i]);
        }
        return  maxVal;

    }
   static long manipulateArrayWithList(int n, List<List<Integer>> queries) {
        long maxVal = Long.MIN_VALUE;
        long[] result = new long[n];
        int length = queries.size();

        for (int i = 0; i < length; i++) {
            int startIndex = queries.get(i).get(0) - 1;
            int endIndex = queries.get(i).get(1) - 1;
            int add = queries.get(i).get(2);
            result[startIndex] += add;
            if (endIndex + 1 < n) {
                result[endIndex + 1] -= add;
            }
        }

        for (int i = 1; i < n; i++) {
            result[i] += result[i - 1];
        }

        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, result[i]);
        }

        return maxVal;
    }

    static long manipulateArray2(int n, int[][] queries){
       long [] results = new long[n+2];
        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k=  queries [i][2];

            results[a]=results[a]+k;
            results[b+1]= results[b+1]-k;
        }
       long max=0;
        for(int i=1;i<=n;i++){
            results[i]=results[i]+results[i+1];
            max=Math.max(results[i],max);
        }
        return  max;

    }
}
