class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       // int a[][]=new int[m][n];
        if(m*n==original.length){
        int mat[][]=new int[m][n];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=original[index++];
            }
        }
        return mat;}
        
        else{
            int mat[][]=new int[0][0];
            return mat;
        }
       // return a;
        
    }
}