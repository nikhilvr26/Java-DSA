package com.dsa.binary;

public class SearchNumberInAsc {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,9,11,15};
        int target = 9;
        int ans = searchNumberInAsc(arr,target);
        if(ans == -1){
            System.out.println("Number is not present");
        }else{
            System.out.println("Number is present at index: "+ans);
        }
    }
    static int searchNumberInAsc(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
