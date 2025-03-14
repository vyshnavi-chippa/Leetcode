class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>0&&a[mid]==a[mid-1]){
                if(mid%2!=0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else if(mid<n-1&&a[mid]==a[mid+1]){
                if((mid)%2==0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                return a[mid];
            }
            
        }
        return 1;
    }
}