class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[][]=new int[m][2];
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            arr[i][0]=c;
            arr[i][1]=i;
        }
       Arrays.sort(arr,(a,b)->{
        if(a[0]!=b[0]){
            return a[0]-b[0];
        }else{
            return a[1]-b[1];
        }
       });
       int ans[]=new int[k];
       for(int i=0;i<k;i++){
        ans[i]=arr[i][1];
       }
       return ans;
    }
}