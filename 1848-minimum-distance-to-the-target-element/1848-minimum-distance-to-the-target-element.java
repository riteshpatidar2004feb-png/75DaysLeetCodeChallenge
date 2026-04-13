class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                int min=Math.abs(i-start);
                if(min<minimum) minimum=min;
            }
        }
        return minimum;
    }
}