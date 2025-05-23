class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int mat[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max=0;
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        max=Math.max(grid[k][l],max);
                    }
                }
                mat[i][j]=max;
            }
        }
        return mat;
    }
}