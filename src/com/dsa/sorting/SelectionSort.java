package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {100,4,45,-54,0,2};
        selectionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    //pick a max or min number and swap that number with the actual index number;
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex );
        }
    }
    //function to get the index of max number
    static int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for(int i = start; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    //function to swap the numbers
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
