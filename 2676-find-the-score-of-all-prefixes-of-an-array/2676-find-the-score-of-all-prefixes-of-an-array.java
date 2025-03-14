class Solution {
    public long[] findPrefixScore(int[] nums) {
        long ps[]=new long[nums.length];
        ps[0]=nums[0]+nums[0];
        long max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            long s=nums[i]+max;
            ps[i]=s+ps[i-1];
        }
        return ps;
    }
}