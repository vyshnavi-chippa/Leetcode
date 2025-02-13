class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a[]=new int[nums.length];
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            a[j]=nums[i];j++;}
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
            a[j]=nums[i];j++;}
        }
        return a;
    }
}