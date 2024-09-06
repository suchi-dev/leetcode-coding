package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an integer array nums, return all the triplets [nums[i],
nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 */

public class ThreeSum {

    public static List<List<Integer>> threeSum(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i;
            int r = nums.length -1;
            while(l < r){
                int threeSum = nums[i] + nums[l] + nums[r];
                if(threeSum > 0) r-=1;
                else if(threeSum < 0) l+=1;
                else {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    l+=1;
                    while(nums[l] == nums[l-1] && l < r){
                        l+=1;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String [] args){
        int [] nums= {-1,0,1,2,-1,-4};
        List<List<Integer>> output = threeSum(nums);
        output.stream().forEach(e -> System.out.println(e));
        int [] nums2 = {-3, 3, -3, 4, 1, 2};
        List<List<Integer>> output2 = threeSum(nums2);
        output2.stream().forEach(e -> System.out.println(e));

    }
}
