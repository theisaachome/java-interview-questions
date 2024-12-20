package com.isaachome;

public class BinarySearch {
    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid =(high - low) / 2 + low;
            if(arr[mid] > target){
                high = mid-1;
            }else if(arr[mid] < target){
                low = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
