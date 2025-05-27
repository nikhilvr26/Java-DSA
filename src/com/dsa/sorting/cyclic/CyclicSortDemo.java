package com.dsa.sorting.cyclic;

import java.util.Arrays;

public class CyclicSortDemo {
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3};
        cyclicSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            // if elements in array are starting from 1 then the correct index should always value-1, and
            // if elements are starting from zero then the correct index should always equal to the value.
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    //function for swapping two numbers
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
