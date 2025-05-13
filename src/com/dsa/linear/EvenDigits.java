package com.dsa.linear;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1,22,456,2456,346,569};
        int ans = checkDigits(arr);
        if(ans == 0){
            System.out.println("No even digit number is present");
        }else {
            System.out.println("Total even digit number are: "+ans);
        }
    }
    static int checkDigits(int[] arr){
        int totalDigit = 0;
        for(int num : arr){
            if(evenDigit(num)){
                totalDigit++;
            }
        }
        return totalDigit;
    }
    static boolean evenDigit(int num){
        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }
        return count%2 == 0;
    }

}
