class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] nums2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            int j=0;
            while(j<=i){
                if(max<nums[j]) max=nums[j];
                j++;
            }
            j=i;
            int min=Integer.MAX_VALUE;
             while(j<nums.length){
                if(min>nums[j]) min=nums[j];
                j++;
            }
            nums2[i]=max-min;
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]<=k) return i;
        }
        return -1;
    }
}