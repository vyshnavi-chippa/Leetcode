class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0;
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                if(f&&c<k){
                    return false;
                }
                f=true;
                c=0;
            }
        }
        return true;
    }
}