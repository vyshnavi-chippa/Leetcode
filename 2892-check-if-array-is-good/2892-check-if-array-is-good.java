class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        if(nums.length<max+1)
        return false;
        for(int i=0;i<nums.length-1;i++){
            if(i==nums.length-2){
                if(nums[i]!=nums[i+1])
                return false;
            }
            else{
                if(nums[i]+1!=nums[i+1])
                return false;
            }
        }
        return true;
    }
}