package com.dsa.binary;

public class FindPeakInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,5,4,3,1}; //consider there is no repeating numbers
        int ans = findPeak(arr);
        System.out.println("Peak element is : "+ ans);
    }
    static int findPeak(int[] arr){
        int start = 0, end = arr.length-1;
        while (start < end){
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
