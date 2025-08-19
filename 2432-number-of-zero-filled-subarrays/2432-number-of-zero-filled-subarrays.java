class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long c=0,s=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                s+=1;
            }
            else{
                s=0;
            }
            c+=s;
        }
        return c;
    }
}