class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int c0=0,c1=0;
            for(int j=i;j<n;j++){
                if(s.charAt(j)=='0')
                c0++;
                else
                c1++;
                if(c0<=k||c1<=k)
                ans++;
                else
                break;
            }
        }
        return ans;
    }
}