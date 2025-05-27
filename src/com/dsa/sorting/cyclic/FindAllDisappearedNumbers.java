package com.dsa.sorting.cyclic;

import java.util.ArrayList;
import java.util.List;

//Questions: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println("Disappeared numbers are: "+ans);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            //here elements are start from 1, in this case correct index of value is value+1 or index+1 = value
            if(index + 1 != nums[index]){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
