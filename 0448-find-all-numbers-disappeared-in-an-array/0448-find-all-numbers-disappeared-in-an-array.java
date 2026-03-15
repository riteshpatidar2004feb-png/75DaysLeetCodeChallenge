class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,n=nums.length;
        while(i<n){
            int index=nums[i]-1;
            if(nums[i]!=nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            
            else i++;
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) list.add(i+1);
        }
        return list;
    }
}