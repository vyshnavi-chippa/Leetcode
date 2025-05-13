class Solution {
    public int[] runningSum(int[] nums) {
        int a[]=new int[nums.length];
        a[0]=nums[0];
        for(int i=0;i<nums.length-1;i++){
            a[i+1]=a[i]+nums[i+1];
        }
        return a;
    }
}