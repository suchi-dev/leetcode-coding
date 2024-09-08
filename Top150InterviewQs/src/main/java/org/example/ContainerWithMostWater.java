package org.example;

public class ContainerWithMostWater {
    public static int getMaxWater(int [] height){
        int res = 0;
        int l = 0;
        int r = height.length -1;
        while(l < r){
            int area = (r -l) * Math.min(height[l], height[r]);
            res = Math.max(area, res);
            if(height[l] < height[r]) {
                l +=1;
            }else {
                r-=1;
            }
        }


        return res;


    }

    public static void main(String[] args) {
        int [] height = new int[]{1,8,6,2,5,4,8,3,7};
        int maxWater = getMaxWater(height);
        System.out.println("Max water in the container is : " +maxWater);
    }
}
