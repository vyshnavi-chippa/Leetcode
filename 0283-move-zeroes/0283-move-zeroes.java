class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i:nums)
        if(i==0)
        c++;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            continue;
            else{
                nums[j]=nums[i];
                j++;
            }

        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}