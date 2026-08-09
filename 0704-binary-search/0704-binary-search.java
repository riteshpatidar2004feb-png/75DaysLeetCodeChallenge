class Solution {
    public int search(int[] nums, int target) {
        // int low=0,high=nums.length-1;
        // while(low<=high){
        //     int mid=(high+low)/2;
        //     if(nums[mid]>target) high=mid-1;
        //     else if(nums[mid]<target) low=mid+1;
        //     else if(nums[mid]==target) return mid;
        // }
        // return -1;

        return search1(nums, 0, nums.length-1, target);
    }
    public int search1(int[] nums, int left, int right, int target){
        if(left > right) return -1;
        int mid = (right - left)/2 + left;
        if(target == nums[mid]) return mid;
        else if(nums[mid] > target) return search1(nums, left, mid - 1, target);
        return search1(nums, mid+1, right, target);
    }
}