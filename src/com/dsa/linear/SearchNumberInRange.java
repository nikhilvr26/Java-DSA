package com.dsa.linear;

public class SearchNumberInRange {
    public static void main(String[] args) {
        int[] arr = {1,4,22,56,7,38,5,25,6};
        int target = 1, startRange = 2, endRange = 7;
        int ans = searchNumberInRange(arr,target,startRange,endRange);
        if(ans == -1){
            System.out.println("Number is not present or not in a range in an array");
        }else{
            System.out.println("Number is present at index: "+ans);
        }
    }
    static int searchNumberInRange(int[] arr, int target, int startRange, int endRange){
        if(arr.length == 0){
            return -1;
        }
        for(int index = startRange; index <= endRange; index++){
            int ans = arr[index];
            if(target == ans){
                return index;
            }
        }
        return -1;
    }
}
