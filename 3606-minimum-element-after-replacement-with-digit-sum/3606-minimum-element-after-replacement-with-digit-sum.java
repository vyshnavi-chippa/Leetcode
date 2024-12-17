class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0,rem=0;
            while(n!=0){
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            nums[i]=sum;
        }
        int min=(int)1e4;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
}