package com.dsa.binary;

public class FindPositionInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,1,4,16,17,19}; // treat this array as a infinite array
        int target = 7;
        int ans = findPosition(arr, target);
        System.out.println("Target number is present at index : "+ans);

    }
    static int findPosition(int[] arr, int target){
        int start = 0, end = 1;
        int newStart = end + 1;

        while(target > arr[end]){
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
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
}
