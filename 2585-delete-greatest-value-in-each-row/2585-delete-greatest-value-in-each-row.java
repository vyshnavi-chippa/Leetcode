class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int k=0,sum=0;
        for(int m=0;m<grid[0].length;m++){
            int max1=0;
        for(int i=0;i<grid.length;i++){
            int max=0;
            for(int j=0;j<grid[i].length;j++){
                if(max<grid[i][j]){
                    max=grid[i][j];
                    k=j;
                    }
                
            }
            grid[i][k]=0;
            if(max1<max){
                        max1=max;
                        
                        
            }

        }
        sum=sum+max1;
        
        }
        return sum;
        
    }
}