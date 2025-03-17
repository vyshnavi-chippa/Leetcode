class Solution {
    public boolean divideArray(int[] nums) {
        int fre[]=new int[500];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]-1]++;
        }
        for(int i:fre){
            if(i%2!=0)
            return false;
        }
        return true;
    }
}