class Solution {
    public int[] findArray(int[] pref) {
        int ps[]=new int[pref.length];
        int ans[]=new int[pref.length];
        ans[0]=pref[0];
        ps[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            pref[i]=ps[i-1]^pref[i];
            ans[i]=pref[i];
            ps[i]=ps[i-1]^pref[i];
            }
        return ans;
    }
}