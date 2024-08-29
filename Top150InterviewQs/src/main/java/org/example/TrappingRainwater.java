package org.example;
/*
Given n non-negative integers representing an elevation map where the
 width of each bar is 1, compute how much water it can trap after raining.
*?
 */
public class TrappingRainwater {

    public  static int trapRainWater(int [] height){
        int l = 0;
        int r = height.length -1;
        int leftMax = height[l];
        int rightMax = height[r];
        int res = 0;
        while(l < r){
            if(leftMax < rightMax){
                l+=1;
                leftMax = Math.max(leftMax, height[l]);
                res+= leftMax - height[l];

            }else {
                r-=1;
                rightMax = Math.max(rightMax, height[r]);
                res+= rightMax - height[r];

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int [] newHeight = new int[]{4,2,0,3,2,5};
        int trappedWater = trapRainWater(height);
        System.out.println("The trapped water is : "+trappedWater);
        int trappedWaterForNewHt = trapRainWater(newHeight);
        System.out.println("The trapped water for the new height is " +trappedWaterForNewHt);
    }
}
