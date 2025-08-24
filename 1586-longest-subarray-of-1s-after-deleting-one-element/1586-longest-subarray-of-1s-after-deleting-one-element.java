class Solution {
    public int longestSubarray(int[] nums) {
        int k=0,c=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) c++;
            while(c>1){
                if(nums[k]==0) c--;
                k++;
            }
            max=Math.max(max,i-k);
        }
        return max;
    }
}