class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int r=0,c=0;
                if(mat[i][j]==1){
                    for(int k=0;k<m;k++){
                        if(mat[k][j]==1&&k!=i)
                        break;
                        else
                        r++;
                    }
                    for(int k=0;k<n;k++){
                        if(mat[i][k]==1&&k!=j)
                        break;
                        else
                        c++;

                    }
                    
                    
                }
                if(r==m&&c==n)
                cnt++;
            }
        }
        return cnt;
    }
}