class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int len=2*n;
        int ans[]=new int[len];
        
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[n+i]=nums[i];
        }
        return ans;
    }
}