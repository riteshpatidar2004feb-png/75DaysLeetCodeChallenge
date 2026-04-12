class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&matrix[i][j]==1){
                    nums[i]++;
                   // nums[j]++;
                }
            }
        }
       // for(int i=0;i<n;i++) nums[i]=nums[i]/2;
        return nums;
    }
}