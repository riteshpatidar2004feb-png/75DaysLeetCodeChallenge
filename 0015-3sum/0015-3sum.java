class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> matrix=new ArrayList<>();
        int n=nums.length;
         if(n==3&&nums[0]+nums[1]+nums[2]==0){
            List<Integer> row = new ArrayList<>();
             row.add(nums[0]);
             row.add(nums[1]);
             row.add(nums[2]);
             matrix.add(row);
            return matrix;
        }

        Arrays.sort(nums);
        int i=0;
        while(i<=n-3){
            if(i>0&&nums[i]==nums[i-1]){
                i++;
                continue;
            }

            int j=i+1;
            int k=n-1; 
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                   List<Integer> row = new ArrayList<>();
             row.add(nums[i]);
             row.add(nums[j]);
             row.add(nums[k]);
             matrix.add(row);
                    while(j<k&&nums[j]==nums[j+1])j++;
                    while(j<k&&nums[k]==nums[k-1])k--;
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
            i++;
        }
        return matrix;
    }
}