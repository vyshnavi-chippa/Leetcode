class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //if(nums.length==)
        long ans=0;
        // for(int i=0;i<nums.length;i++){
        //     int c=0;
        //     if(nums[i]==0){
        //         c++;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]==0){
        //             c++;
        //         }else
        //         break;
        //     }}
        //     ans+=c;
        // }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c=c+1;
                ans=ans+c;
            }
            else{
                c=0;
            }
        }
        return ans;
    }
}