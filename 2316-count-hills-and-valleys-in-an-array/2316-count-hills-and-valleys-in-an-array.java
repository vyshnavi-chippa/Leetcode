class Solution {
    public int countHillValley(int[] nums) {
        int c=0,n=nums.length;
        for(int i=1;i<n-1;i++){
            if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]){
                if((nums[i]>nums[i-1]&&nums[i]>nums[i+1])||(nums[i]<nums[i-1]&&nums[i]<nums[i+1]))
                c++;
                
            }
            else if(nums[i]==nums[i-1])
            continue;
            else{
                int j=i;
                while((j<n-1)&&(nums[i]==nums[j])){
                    j++;
                }
                if((nums[i]>nums[i-1]&&nums[i]>nums[j])||(nums[i]<nums[i-1]&&nums[i]<nums[j]))
                c++;
            }
        }
        return c;
    }
}