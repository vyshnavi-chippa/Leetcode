class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length,k=0,c=0;
        int a[]=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            a[k++]=grid[i][j];
        }
        Arrays.sort(a);
        int ans[]=new int[2];
        for(int i=0;i<k-1;i++){
            if(a[i]==a[i+1]){
                ans[0]=a[i];
                break;
            }
        }
        for(int j=1;j<=k;j++){
            c=0;
        for(int i=0;i<k;i++){
            if(a[i]==j){
                c=1;
                break;
            }
        }
        if(c==0){
        ans[1]=j;break;}
        }
        
       return ans;
    }
}