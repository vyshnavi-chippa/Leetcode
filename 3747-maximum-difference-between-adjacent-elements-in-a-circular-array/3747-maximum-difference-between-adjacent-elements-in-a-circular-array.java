class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=-500;
        for(int i=0;i<nums.length-1;i++)
        max=Math.max(Math.abs(nums[i]-nums[i+1]),max);
        max=Math.max(Math.abs(nums[nums.length-1]-nums[0]),max);
        return max;
    }
}