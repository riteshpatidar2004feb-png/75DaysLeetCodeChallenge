class Solution {
    public int maxArea(int[] height) {
      int n=height.length, i=0, j=n-1, maxArea=Integer.MIN_VALUE;
        while(i<j){
            int dis=j-i;
            int length=Math.min(height[i],height[j]);
            int area=dis*length;
            if(area>maxArea) maxArea=area;
            if(height[i]>height[j]) j--;
            else i++;
        }
        return maxArea;
    }
}