class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=0;
            }
            else{
                count++;
                if(maxc<count){
                    maxc=count;
                }
            }
           
        } return maxc;
        
    }
}