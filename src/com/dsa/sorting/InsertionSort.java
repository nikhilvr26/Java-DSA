package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {100,4,45,-54,0,2};
        insertionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    /*Outer loop picks elements one by one (i)
    Inner loop (j) moves the picked element backward into its correct position in the sorted part.
    swap() exchanges elements to maintain order*/
    static void insertionSort(int[] arr){
        /*Compare 100 and 4 → swap → [4, 100, 45, -54, 0, 2]
        Insert 45 in correct position → [4, 45, 100, -54, 0, 2]
        Insert -54 → [ -54, 4, 45, 100, 0, 2 ]
        Insert 0 → [ -54, 0, 4, 45, 100, 2 ]
        Insert 2 → [ -54, 0, 2, 4, 45, 100 ]*/
        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j-1, j);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
