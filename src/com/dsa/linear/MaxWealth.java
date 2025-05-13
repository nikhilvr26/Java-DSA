package com.dsa.linear;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,4,6},
                {4,5,6},
                {2,1,3}
        };
        int ans = findTotalWealth(accounts);
        if(ans == 0){
            System.out.println("No account is present");
        }else{
            System.out.println("Max wealth is : "+ans);
        }
    }
    static int findTotalWealth(int[][] accounts){
        if(accounts.length == 0){
            return 0;
        }
        int maxWealth = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++ ){
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
                }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
