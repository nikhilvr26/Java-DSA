package com.dsa.linear;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,22,56,7,38,5,25,6};
        int target = 56;
        int ans = searchNumber(arr, target);
        if(ans == -1) {
            System.out.println("Number is not present in an array");
        }else{
            System.out.println("Number is present at index: "+ans);
        }
    }

    static int searchNumber(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int ans = arr[index];
            if(target == ans){
                return index;
            }
        }
        return -1;
    }
}