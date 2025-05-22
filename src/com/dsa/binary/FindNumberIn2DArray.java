package com.dsa.binary;

import java.util.Arrays;

public class FindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  3,  5,  7},
                {2,  6,  8, 10},
                {4,  9, 12, 14},
                {11, 13, 15, 16}
        };
        int target = 12;
        int[] ans = findTargetIndex(matrix, target);
        if(ans[0] != -1){
            System.out.println("Number present at: "+ Arrays.toString(ans));
        }else{
            System.out.println("Number is not present");
        }

    }
    static int[] findTargetIndex(int[][] arr, int target){
        int row= 0;
        int col = arr.length-1;
        while(row < arr.length && col >=0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(arr[row][col] < target){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
