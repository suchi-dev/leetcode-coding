package org.example;

/*
Given an integer array nums, find the subarray with the largest sum,
and return its sum.


 */
public class MaximumSubArray {

    public static int getSubArraySum(int [] nums){
        int maxSub = nums[0];
        int currSum = 0;

        for(int n : nums){
            if(currSum < 0)
                currSum = 0;
            currSum+=n;
            maxSub = Math.max(maxSub, currSum);
        }
        return maxSub;
    }
    public static void main(String[] args) {
        int [] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int result = getSubArraySum(arr);
        System.out.println("The result is : "+result);
        int [] arr1 = new int[]{5,4,-1,7,8};
        int result1 = getSubArraySum(arr1);
        System.out.println("The result is : "+result1);
    }
}
