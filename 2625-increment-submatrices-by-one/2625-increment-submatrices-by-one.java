class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        // int a[]=new int[n*n];
        // for(int i=0;i<n*n;i++){
        //     a[i]=0;
        // }
        // for(int i=0;i<queries.length;i++){
        //     int x=queries[i][0]*n+queries[i][1];
        //     int y=queries[i][2]*n+queries[i][3];
        //     for(int j=x;j<=y;j++){
        //         if(j%n>=x%n&&j%n<=y%n)
        //         a[j]=a[j]+1;
        //     }
        // }
        // int mat[][]=new int[n][n];
        // int idx=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         mat[i][j]=a[idx++];
        //     }
        // }
        // return mat;
        int mat[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         mat[i][j]=0;
        //     }
        // }
        for(int i=0;i<queries.length;i++){
            for(int m=queries[i][0];m<=queries[i][2];m++){
                for(int k=queries[i][1];k<=queries[i][3];k++){
                    mat[m][k]+=1;
                }
            }
        }
        return mat;
    }
}