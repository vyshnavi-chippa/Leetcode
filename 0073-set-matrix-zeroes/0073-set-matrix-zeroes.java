class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        long matrix1[][]=new long[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            matrix1[i][j]=(long)matrix[i][j];
        }
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                if(matrix1[i][j]==0){
                    for(int k=0;k<matrix1[0].length;k++){
                        if(matrix1[i][k]!=0)
                        matrix1[i][k]=Long.MAX_VALUE;

                    }
                    for(int k=0;k<m;k++){
                    if(matrix1[k][j]!=0)
                    matrix1[k][j]=Long.MAX_VALUE;
                }}
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix1[i][j]==Long.MAX_VALUE){
                    matrix1[i][j]=0;
                }
            }
           
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            matrix[i][j]=(int)matrix1[i][j];
        }
    }
}