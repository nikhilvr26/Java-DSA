package com.dsa.sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {100,4,45,-54,0,2};
        bubbleSort(arr);
            System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    //In this method we compare all numbers with its immediate lesser number
    static void bubbleSort(int[] arr){
        boolean isSwapped = false;
        for(int i = 0; i < arr.length; i++){
            //running j loop till arr.length-i because every first iteration of outer loop, array get start sorted at the end
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
