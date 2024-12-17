class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    int max=-1;
                    for(int k=0;k<m;k++){
                        if(max<matrix[k][j]){
                            max=matrix[k][j];
                        }
                        
                    }
                    ans[i][j]=max;
                }
                else{
                    ans[i][j]=matrix[i][j];
                }
            }
        }
        return ans;
    }
}