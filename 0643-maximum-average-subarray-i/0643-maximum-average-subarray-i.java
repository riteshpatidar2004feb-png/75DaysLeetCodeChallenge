class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        int left=0, right=k-1;
        double maxAverage=(double)sum/k;
        while(right<nums.length){
           if((right+1)<nums.length)sum=sum+nums[right+1]-nums[left];
            double average=(double)sum/k;
            if(average>maxAverage) maxAverage=average;
            left++;right++;
        }
        return maxAverage;
    }
}