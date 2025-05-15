package com.dsa.binary;

/*Order-agnostic binary search is a variation of the binary search algorithm used
to find a target element within a sorted array, regardless of whether the array is sorted in ascending or descending order*/

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arrayInAsc = {2, 4, 5, 6, 8, 9, 11, 15};
        int[] arrayInDsc = {12, 10, 9, 6, 5, 2, 0, -2, -11};
        int target = 4;
        int ans = searchNumber(arrayInAsc, target);
        if (ans == -1) {
            System.out.println("Number is not present");
        } else {
            System.out.println("Number is present at index: " + ans);
        }
    }
    static int searchNumber(int[] arr, int target){
        boolean isAsc = arr[0] < arr[arr.length-1];
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                  if (arr[mid] < target) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else {
                  if (arr[mid] > target) {
                    start = mid +1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

