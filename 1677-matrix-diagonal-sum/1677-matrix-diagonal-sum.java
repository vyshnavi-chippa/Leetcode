class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1||i==j)
                sum=sum+mat[i][j];
            }
        }
       // if(n%2!=0){
       //     int e=n/2;
       //    return sum-mat[e][e];
       // }
        return sum;
    }
}