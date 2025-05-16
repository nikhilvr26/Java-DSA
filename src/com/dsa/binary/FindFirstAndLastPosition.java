package com.dsa.binary;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,7,7,7,8,8,9};
        int target = 7;
        int[] ans = findIndices(arr, target);
        if(ans[0] != -1) {
            System.out.println("First and last indices of a number are: " + Arrays.toString(ans));
        }else{
            System.out.println("Number is not present");
        }
    }
    // return the first and last index of a target number, if it not found then return [-1,-1]
    static int[] findIndices(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = findPosition(arr, target, true);
        if(ans[0] != -1 ){
            ans[1] = findPosition(arr, target, false);
        }
        return ans;
    }
    static int findPosition(int[] arr, int target, boolean firstPosition){
        int start = 0, end = arr.length-1;
        int potentialAns = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                potentialAns = mid;
                if(firstPosition){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return potentialAns;
    }
}
