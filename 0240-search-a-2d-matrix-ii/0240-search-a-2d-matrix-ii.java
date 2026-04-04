class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length,j=0;
        // while(j<m-1){
        //     if(matrix[j][0]<target) j++;
        //     else break;
        // }

        // for(int i=0;i<=j;i++){
        //     int low=0,high=n-1;
        //     while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(matrix[i][mid]==target) return true;
        //         if(matrix[i][mid]>target) high=mid-1;;
        //         if(matrix[i][mid]<target) low=mid+1;
        //     }
        // }
        // return false;

        int row=0,col=n-1;
        while(row<m&&col>=0){
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target) row++;
            else col--; 
        }
        return false;
    }
}