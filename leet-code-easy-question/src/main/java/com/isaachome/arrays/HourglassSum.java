package com.isaachome.arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HourglassSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = findMaxHourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

        int maxHourglassSum = findMaxHourglassSum(arr);
        System.out.println("The highest hourglass sum is: " + maxHourglassSum);
    }

    public static int findMaxHourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentHourglassSum = calculateHourglassSum(arr, i, j);
                if (currentHourglassSum > maxSum) {
                    maxSum = currentHourglassSum;
                }
            }
        }
        return maxSum;
    }

    private static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
        int sum = 0;
        sum += arr.get(row).get(col);
        sum += arr.get(row).get(col + 1);
        sum += arr.get(row).get(col + 2);
        sum += arr.get(row + 1).get(col + 1);
        sum += arr.get(row + 2).get(col);
        sum += arr.get(row + 2).get(col + 1);
        sum += arr.get(row + 2).get(col + 2);
        return sum;
    }
}
