package org.example;

import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public static int getMajorityElement(int [] nums){
        int maxCount = 0;
        int res = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int n : nums){
            countMap.put(n , 1 + countMap.getOrDefault(n, 0));
            if(countMap.get(n) > maxCount){
                res = n;

            }
            maxCount = Math.max(maxCount, countMap.get(n));
        }
        return res;


    }

    public static void main(String[] args) {
        int [] arr = new int[]{2,2,1,1,1,2,2};
        int majorityElement = getMajorityElement(arr);
        System.out.println("The majority Element is : "+majorityElement);
    }
}
