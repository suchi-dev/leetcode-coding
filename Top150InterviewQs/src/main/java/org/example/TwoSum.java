package org.example;


import java.util.HashMap;
import java.util.Map;

/*
Given an integer array and a target sum, return the index of 2 elements from
the integer array whose sum is equal to the target
 */
public class TwoSum {
    public static int[] getTwoSum(int [] nums, int target){
        Map<Integer, Integer> prevMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(prevMap.containsKey(diff)){
                return new int[]{i, prevMap.get(diff)};
            }
            prevMap.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int [] arr = new int[]{3,1,4,7,8};
        int [] result = getTwoSum(arr, 9);
        System.out.println("The result is : " +result[0]+"|"+result[1]);
    }
}
