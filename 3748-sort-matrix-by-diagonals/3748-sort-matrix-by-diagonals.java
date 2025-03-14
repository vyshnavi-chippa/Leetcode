class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int mat[][]=new int[n][n];
        for(int k=0;k<n;k++){
            int i=0,j=0;
            List<Integer> al=new ArrayList<>();
            for(i=n-k-1,j=0;i<n;i++,j++){
                al.add(grid[i][j]);
                
            }
            Collections.sort(al,Collections.reverseOrder());
           
            for(i=n-k-1,j=0;i<n;i++,j++){
                mat[i][j]=al.get(j);
            }
            
        }
        for(int k=0;k<n-1;k++){
            int i=0,j=0;
            List<Integer> al=new ArrayList<>();
            for(i=0,j=k+1;j<n;i++,j++){
                al.add(grid[i][j]);
                
            }
            Collections.sort(al);
            for(i=0,j=k+1;j<n;i++,j++){
                mat[i][j]=al.get(i);
            }
        }
        return mat;
    }
}