package com.dsa.linear;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int target = 11;
        int[] ans = searchIn2dArray(arr,target);
        int row = ans[0];
        int col = ans[1];
        if(row == -1){
            System.out.println("Number is not present in an array");
        }else {
            System.out.println("Number is present at row : " + row + " and column : " + col);
        }
    }
    static int[] searchIn2dArray(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
