class Solution {
    public int findGCD(int[] nums) {
        int mx=nums[0],mn=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx) mx=nums[i];
            if(nums[i]<mn) mn=nums[i];
        }
        // int gcd = 1;
        //  for(int i=2;i<=mn;i++){
        //     if(mx%i==0&&mn%i==0){
        //         gcd = i;
        //     }
        //  }
        //     return gcd;
        return helper(mn,mx);
    }
    public int helper(int a, int b){
        if(a%b == 0) return b;
        int b1 = helper(b, a%b);
        return b1;
    }
}