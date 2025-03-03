class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
            }
        }
        int p1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[p1]=nums[i];
                p1++;
            }
        }
        for(int i=p1;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }
}