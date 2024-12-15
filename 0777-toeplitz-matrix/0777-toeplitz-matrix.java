class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=m-2;i>=0;i--){
            int j=0;
            for(int k=i;k<m-1&&j<n-1;k++){
                if(matrix[k][j]==matrix[k+1][j+1]){
                    j++;
                }
                else
                return false;
            }
        }
        for(int j=1;j<n-1;j++){
            int i=0;
            for(int k=j;k<n-1&&i<m-1;k++){
                if(matrix[i][k]==matrix[i+1][k+1])
                i++;
                else
                return false;
            }
        }
        return true;
    }
}