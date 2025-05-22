package com.dsa.binary;

public class FindMinOfMaxSum {
    public static void main(String[] args){
        int[] arr = {7,2,5,10,8};
        int split = 2;
        int ans = findMinOfMax(arr, split);
        if(ans != -1) {
            System.out.println("Min sum of Max sum is : "+ans);
        }else{
            System.out.println("Something went wrong");
        }
    }
    static int findMinOfMax(int[] arr, int split){
        int start = 0, end = 0;
        for(int num : arr){
            start = Math.max(start, num);
            end += num;
        }
        while(start < end){
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start)/2;
            for(int num : arr){
                if(num + sum > mid){
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if(pieces > split){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end;
    }
}
