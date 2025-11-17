class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            s1+=nums[i];
            int n=nums[i];
            while(n!=0){
                int r=n%10;
                s2+=r;
                n=n/10;
            }
        }
        return s1-s2;
    }
}