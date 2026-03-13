class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ret=false;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) count++;
            if(count>1) return true;
            else count=1;
        }
        return ret;
        // boolean notdiff=false;
        // for(int i=0;i<nums.length;i++){
        //     int count=1;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]) count++;
        //         if(j>1000) break;
        //     }
        //     if(count>1) {
        //         notdiff=true;
        //         break;
        //     }
        // }
        // return notdiff;
    }
}