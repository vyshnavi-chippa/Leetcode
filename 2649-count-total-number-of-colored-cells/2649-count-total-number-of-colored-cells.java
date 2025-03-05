class Solution {
    public long coloredCells(int n) {
        int mod=(int)1e9+7;
        long k=(long)n;
        long ans=k*k+(k-1)*(k-1);
        return ans;
    }
}