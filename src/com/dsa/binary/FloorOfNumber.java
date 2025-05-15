package com.dsa.binary;

/*The floor of a number x in a sorted array is the largest element in the array that is smaller than or equal to x*/
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 9, 11, 15};
        int target = 7;
        int ans = findFloor(arr, target);
        if (ans == -1) {
            System.out.println("Number is not present");
        } else {
            System.out.println("Number is present : " + ans);
        }
    }
    static int findFloor(int[] arr, int target){
        if(target < arr[0]){
            return -1;
        }
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return arr[end];
    }
}
