class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p1=0,p2=0;
        int n=nums.length;
        int a[]=new int[n];
        int idx=0;
        while(p1<n&&p2<n){
            if(idx%2==0){
                if(nums[p1]>0){
                a[idx]=nums[p1];
                idx++;p1++;}
                else{
                    p1++;
                }
            }
            else if(idx%2!=0){
                if(nums[p2]<0){
                a[idx]=nums[p2];idx++;p2++;}
                else{
                    p2++;
                }
            }
            
        }
        while(p1<n){
            
                if(nums[p1]>0){
                a[idx]=nums[p1];
                idx++;p1++;}
                else{
                    p1++;
                }
            
        }
        while(p2<n){
             
                if(nums[p2]<0){
                a[idx]=nums[p2];idx++;p2++;}
                else{
                    p2++;
                }
            
        }
        return a;
    }
}
//p1 0  1    2  3 4 5
//p2 0  1 2  3      4 5 6
//idx 0 1    2      3