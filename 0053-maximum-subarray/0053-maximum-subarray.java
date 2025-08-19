class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int mx=nums[0],s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            mx=Math.max(mx,s);
            if(s<0){
                s=0;
            }
        }
        return mx;
    }
}