package com.isaachome.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        var result = transposeMatrix(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Arrays.stream(result).forEach(System.out::println);
    }
    public static  int[][] transposeMatrix(int [][] matrix){
        int rows= matrix.length;
        int cols = matrix[0].length;
        int [][] new_matrix = new int[cols][rows];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                new_matrix[j][i] = matrix[i][j];
            }

        }
        return  new_matrix;
    }
}
