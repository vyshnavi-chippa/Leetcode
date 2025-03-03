class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int a[]=new int[nums.length];
        int p1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                a[p1]=nums[i];
                p1++;
            }
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                a[p1]=nums[i];
                p1++;
            }
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                a[p1]=nums[i];
                p1++;
            }
            
        }
        return a;
    }
}