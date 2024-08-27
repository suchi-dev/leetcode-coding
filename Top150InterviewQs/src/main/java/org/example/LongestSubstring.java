package org.example;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s, find the length of the longest substring
 without repeating characters.
 */
public class LongestSubstring {

    public static int getLongestSubstring(String s){
        Set<Character> mySet = new HashSet<>();
        int l = 0;
        int result = 0;
        for(int r =0; r < s.length(); r++){
            while(mySet.contains(s.charAt(r))){
                mySet.remove(s.charAt(l));
                l+=1;
            }
            mySet.add(s.charAt(r));
            result = Math.max(result, r - l +1);
        }
        return result;
    }

    public static void main(String [] args){
        int output = getLongestSubstring("abcabcbb");
        int result1 = getLongestSubstring("bbbbb");
        System.out.println("The result is : "+output);
        System.out.println("The result is : "+result1);

    }
}
