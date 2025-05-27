package com.dsa.sorting.cyclic;

//Question: https://leetcode.com/problems/missing-number/
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int ans = missingNumber(arr);
        System.out.println("Missing number is : "+ans);
    }
    static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]; //because elements are starts from 0
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            } // swapping is done till here
            //Now find missing number.
        }
        for(int index= 0; index < nums.length; index++){
            //here elements are start from zero, in this case value = index
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
