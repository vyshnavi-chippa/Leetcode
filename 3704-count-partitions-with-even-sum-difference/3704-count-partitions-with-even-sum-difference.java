class Solution {
    public int countPartitions(int[] nums) {
        int pf[]=new int[nums.length];
        pf[0]=nums[0];
        for(int i=0;i<nums.length-1;i++)
        pf[i+1]=pf[i]+nums[i+1];
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(2*pf[i]-pf[nums.length-1])%2==0)
            c++;
        }
        return c;
    }
}