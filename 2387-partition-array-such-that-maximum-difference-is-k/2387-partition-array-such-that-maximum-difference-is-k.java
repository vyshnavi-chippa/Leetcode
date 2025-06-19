class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int c=1;
        int n=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]-n>k){
                c++;
                n=nums[i];
            }
        }
        return c;
    }
}