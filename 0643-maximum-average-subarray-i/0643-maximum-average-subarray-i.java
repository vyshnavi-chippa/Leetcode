class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=-100000,sum=0;
        for(int i=0;i<k;i++)
        sum+=nums[i];
        max=Math.max(sum/k,max);
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(sum/k,max);
        }
        return max;
    }
}