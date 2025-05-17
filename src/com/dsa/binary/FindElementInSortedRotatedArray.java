package com.dsa.binary;

public class FindElementInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,11,1,2,3};
        int target = 5;
        int ans = targetIndex(arr, target);
        if(ans != -1){
            System.out.println("Target number is present at index : "+ ans);
        }else {
            System.out.println("Number is not present");
        }    }
    static int targetIndex(int[] arr, int target){
        int pivot = findPivot(arr);
        int ansInFirstHalf = findIndexUsingBinarySearch(arr, target, 0, pivot);
        if(ansInFirstHalf != -1){
            return ansInFirstHalf;
        }
        return findIndexUsingBinarySearch(arr, target, pivot+1, arr.length-1);
    }
    static int findIndexUsingBinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = start + (end -start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
