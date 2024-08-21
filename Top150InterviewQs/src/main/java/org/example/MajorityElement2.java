package org.example;
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
Follow-up: Could you solve the problem in linear time and in O(1) space?
 */

public class MajorityElement2 {
    public static int getMajorityElement(int []nums){
        int count = 0;
        int res = 0;


        for(int n : nums){
            if(count ==0) res = n;
            count += (res == n ? 1 : -1);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,2,1,1,1,2,2};
        int res = getMajorityElement(arr);
        System.out.println("The majority element in the array is : "+res);
    }
}
