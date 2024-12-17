class Solution {
    public int findChampion(int[][] grid) {
        int mc=0,ind=0;
        for(int i=0;i<grid.length;i++){
            int c=0;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    c++;
                }

            }
            if(mc<c){
                mc=c;
                ind=i;
            }
        }
        return ind;
    }
}