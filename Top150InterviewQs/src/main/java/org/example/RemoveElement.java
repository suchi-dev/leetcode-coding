package org.example;

import java.util.Arrays;

/*
Remove the element specified and all it's occurrences in place
Return the number of elements after the removal of the
specified element
 */
public class RemoveElement {

    public static int removeElement(int [] nums, int val){
        int k = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] !=val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String [] args){
        int [] nums = new int[]{3,2,2,3,4,5};
        int res = removeElement(nums,3);
        System.out.println("The # of elements : "+res);
    }
}
