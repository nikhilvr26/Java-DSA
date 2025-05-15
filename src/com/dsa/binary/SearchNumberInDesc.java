package com.dsa.binary;

public class SearchNumberInDesc {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 6, 5, 2, 0, -2, -11};
        int target = -2;
        int ans = searchNumberInDesc(arr, target);
        if (ans == -1) {
            System.out.println("Number is not present");
        } else {
            System.out.println("Number is present at index: " + ans);
        }
    }
    static int searchNumberInDesc(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                start = mid +1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
