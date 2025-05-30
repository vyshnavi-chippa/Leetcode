class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            for(int j=0;j<31;j++){
                c+=((i>>j)&1);
            }
            ans[i]=c;
        }
        return ans;
    }
}