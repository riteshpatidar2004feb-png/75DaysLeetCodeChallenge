class Solution {
    public void rotate(int[][] matrix) {
        int i=0;
        while(i<matrix.length){
            int j=i;
            while(j<matrix[i].length){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                j++;
            }
            i++;
        }

        i=0;
        int j=matrix[0].length-1;
        while(i<j){
            int i1=0,j1=0;
            while(i1<matrix.length&&j1<matrix.length){
                int temp=matrix[i1][i];
                matrix[i1][i]=matrix[j1][j];
                matrix[j1][j]=temp;
                i1++;j1++;
            }
            i++;j--;
        }

        
    }
}