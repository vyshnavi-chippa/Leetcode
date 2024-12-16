class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int min=0,index=0;
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    c++;
                    
                }
            }
            if(min<c){
                min=c;
                index=i;
            }
        }
        int b[]=new int[2];
        b[0]=index;
     b[1]=min;
        return b;
    }
}