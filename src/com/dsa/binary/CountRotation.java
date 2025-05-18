package com.dsa.binary;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        int ans = totalCount(arr);
        if(ans !=0){
            System.out.println("Total count are: "+ ans);
        }else {
            System.out.println("Array is not rotated");
        }
    }
    static int totalCount(int[] arr){
        int count = findPivot(arr);
        if(count != -1){
            return count + 1;
        }
        return 0;
    }
    static int findPivot(int[] arr){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //mid is the pivot
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
