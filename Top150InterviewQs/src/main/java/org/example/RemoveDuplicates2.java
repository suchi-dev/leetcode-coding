/*
Given an integer array nums sorted in non-decreasing order,
remove some duplicates in-place such that each unique
element appears at most twice. The relative order of the elements
should be kept the same.
 */
package org.example;


public class RemoveDuplicates2 {

    public static int removeDuplicates(int [] nums){
        int i = 0;
        for(int num: nums){
            if(i < 2 || num > nums[i]){
                nums[i++] = num;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3};
        int res = removeDuplicates(arr);
        System.out.println("The result is : "+res);

    }
}
