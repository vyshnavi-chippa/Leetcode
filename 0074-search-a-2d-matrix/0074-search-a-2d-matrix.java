class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=0,low=0,high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid][0]<target){
                ans=mid;
                low=mid+1;
            }
            else if(matrix[mid][0]>target){
                high=mid-1;
            }
            else{
                return true;
            }
        }
        low=0;high=n-1;
       while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[ans][mid]<target){
                low=mid+1;
            }
            else if(matrix[ans][mid]>target){
                high=mid-1;
            }
            else{
                return true;
            }
       }
        return false;
    }
}