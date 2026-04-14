class Solution {
    public int minMoves(int[] nums) {
        // int n=nums.length;
        // if(n==1) return 0;
        // if(n==2){
        //     Arrays.sort(nums);
        //     return nums[1]-nums[0];
        // }
        // Arrays.sort(nums);
        // if(nums[0]==nums[n-1]) return 0;

        // int count=0;
        // while(true){
        //     int i=1,j=n-1;
        //     while(i<=j){
        //         nums[i]--;nums[j]--;i++;j--;
        //     }
        //     count++;
        //     Arrays.sort(nums);
        //     if(nums[0]==nums[n-1]) break;
        // }
        // return count;
        int n=nums.length,sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(nums[i]<min) min=nums[i];
        }

        return sum-n*min;
    }
}