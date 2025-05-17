package com.dsa.binary;

public class FindElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,5,2,0,-1};
        int target = 4;
        int ans = findAnswer(arr, target);
        if(ans != -1){
            System.out.println("Target number is present at index : "+ ans);
        }else {
            System.out.println("Number is not present");
        }
    }
    static int findAnswer(int[] arr, int target){
        int peak = findPeakIndex(arr);
        int start = 0;
        int ansInAsc = findTargetUsingBinarySearch(arr, target, start, peak);
        if(ansInAsc != -1){
            return ansInAsc;
        }
        return findTargetUsingBinarySearch(arr, target, peak+1, arr.length-1);
    }
    static int findTargetUsingBinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end -start)/2;
            if(isAsc){
                if(arr[mid] == target){
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }else if(arr[mid] > target) {
                    end = mid-1;
                }else {
                    return -1;
                }
            }else {
                if(arr[mid] == target){
                    return mid;
                }else if (arr[mid] > target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    static int findPeakIndex(int[] arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return end;
    }
}
