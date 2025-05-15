package com.dsa.binary;

public class FindSmallChar {
    public static void main(String[] args) {
        char[] ch = {'a', 'c', 'e', 'z'};
        char target = 'c';
        char ans = findSmallestChar(ch, target);
        System.out.println("Smallest char is : "+ans);
    }
    static char findSmallestChar(char[] ch, char target){
        int start = 0, end = ch.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(ch[mid] > target){
                end = end - 1;
            }else{
                start = start + 1;
            }
        }
        return ch[start % ch.length];
    }
}
