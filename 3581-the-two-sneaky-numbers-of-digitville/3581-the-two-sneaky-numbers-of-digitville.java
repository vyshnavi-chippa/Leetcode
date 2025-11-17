class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int a[]=new int[2];
        int idx=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            a[idx++]=nums[i];
        }
        return a;
    }
}