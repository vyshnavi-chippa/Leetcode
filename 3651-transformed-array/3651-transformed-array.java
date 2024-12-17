class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               int index=(i+nums[i])%nums.length;
            
            if(index<0){
                index+=nums.length;
            }
                ans[i]=nums[index];}
            else{
                ans[i]=0;
            }
        }
        return ans;
    }
}