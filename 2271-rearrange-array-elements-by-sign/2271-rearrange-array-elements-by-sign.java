class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int a[]=new int[n];
       int j=0,k=1,p=0;
       for(int i=0;i<n;i++) {
            if(nums[i]>0){
                a[j]=nums[i];
                j+=2;
            }
            if(nums[i]<0){
                a[k]=nums[i];
                k+=2;
            }
       }
       return a;
    }
}