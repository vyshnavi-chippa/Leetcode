class Solution {
    public int minimumArea(int[][] grid) {
        int r1=1001,r2=-1,c1=1001,c2=-1;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    r1=Math.min(r1,i);
                    c1=Math.min(c1,j);
                    r2=Math.max(r2,i);
                    c2=Math.max(c2,j);
                    //System.out.print(r+" "+c+" ");
                }

            }
        }
        return (r2-r1+1)*(c2-c1+1);
    }
}