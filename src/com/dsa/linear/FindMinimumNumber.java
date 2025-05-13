package com.dsa.linear;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {-1,4,22,56,7,38,5,25,6,-23};
        System.out.println("Minimum number is : "+findMinimum(arr));
    }
    static int findMinimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}
