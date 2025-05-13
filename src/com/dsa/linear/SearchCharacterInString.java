package com.dsa.linear;

public class SearchCharacterInString {
    public static void main(String[] args) {
        String str = "Linear Search";
        char target = 'e';
        if(searchChar(str, target)){
            System.out.println("Character is present in a string");
        }else {
            System.out.println("Character is not present");
        }
    }
    static boolean searchChar(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char c : str.toCharArray()){
            if(target == c){
                return true;
            }
        }
        return false;
    }
}
