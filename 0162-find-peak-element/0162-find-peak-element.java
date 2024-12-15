class Solution {
    public int bsearch(int a[],int low,int high){
        int mid=low+(high-low)/2;
        if(low==high)
        return low;
        else if(mid-1==-1){
            if(a[mid]>a[mid+1])
            return mid;
            else 
            return mid+1;
        }
        else{
        
        if(a[mid]>a[mid-1]&&a[mid]>a[mid+1])
        return mid;
        else if(a[mid+1]>a[mid])
        return bsearch(a,mid+1,high);
        else
        return bsearch(a,low,mid-1);}
    }
    public int findPeakElement(int[] nums) {
        return bsearch(nums,0,nums.length-1);
    }
}