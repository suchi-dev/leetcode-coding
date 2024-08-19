package org.example;
/*
Remove duplicates from an array in place
Return thr total number of elements after removal of duplicates
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int [] nums){
        int l = 1;
        for(int r = 1; r< nums.length; r++){
            if(nums[r] != nums[r-1]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }

    public static void main(String [] args){
        int [] nums = new int[] {1,2,2,3,4,4,5,6,7,7,8};
        int k = removeDuplicates(nums);
        System.out.println("After removing duplicates -----");
        System.out.println("The number of elements : " +k);
    }

}
