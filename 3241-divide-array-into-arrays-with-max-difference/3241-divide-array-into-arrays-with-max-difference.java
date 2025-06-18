class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int mat[][]=new int[n/3][3];
        int idx=0;
        for(int i=0;i<n/3;i++){
            for(int j=0;j<3;j++){
                // if(idx<n-1&&(nums[idx+1]-nums[idx]>k))
                // return new int[0][0];
                mat[i][j]=nums[idx];
                System.out.print(mat[i][j]+" ");
                idx++;
            }
        }
        for(int i=0;i<n/3;i++){
            if(mat[i][2]-mat[i][0]>k)
            return new int[0][0];
        }
        return mat;
    }
}