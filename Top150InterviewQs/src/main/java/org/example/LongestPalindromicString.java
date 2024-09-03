package org.example;
/*
Given a string s, return the longest palindromic substring in s.
 */
public class LongestPalindromicString {


    public static String getLongestPalindrome(String s){
        int resLen = 0;
        String res ="";
        int l = 0;
        int r = 0;
        for(int i =0; i < s.length(); i++){
            // odd length
           l =i;
           r = i;
           while(l >=0 && r< s.length() && s.charAt(l) == s.charAt(r)){
               if(r- l + 1 > resLen){
                   res = s.substring(l, r+1);
                   resLen = r - l+1;
               }
               l-=1;
               r+=1;
           }
           //even length
            l = i;
           r= i+1;
            while(l >=0 && r< s.length() && s.charAt(l) == s.charAt(r)){
                if(r- l + 1 > resLen){
                    res = s.substring(l, r+1);
                    resLen = r - l+1;
                }
                l-=1;
                r+=1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String longestPalindrome =  getLongestPalindrome("babadc");
        System.out.println(longestPalindrome);
        System.out.println(getLongestPalindrome("anbbchj"));


    }
}
