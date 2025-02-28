class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int p1=m-1,p2=0;
        while(p1>=0&&p2<n){
            if(target<matrix[p1][p2]){
                p1--;
            }
            else if(target>matrix[p1][p2]){
                p2++;
            }
            else
            return true;
        }
        return false;
    }
}