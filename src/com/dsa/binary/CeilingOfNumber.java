package com.dsa.binary;

/*The ceiling of a number x in a sorted array is the smallest element in the array that is greater than or equal to x*/
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 9, 11, 15};
        int target = 16;
        int ans = findCeilingOfNumber(arr, target);
        if (ans == -1) {
            System.out.println("Number is not present");
        } else {
            System.out.println("Number is present : " + ans);
        }
    }
    static int findCeilingOfNumber(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return arr[mid];
            }else if (arr[mid] < target){
                start = mid +1;
            }else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
