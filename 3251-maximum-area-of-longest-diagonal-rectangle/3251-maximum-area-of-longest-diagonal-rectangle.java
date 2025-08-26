class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=1;
        float max=0;
        int n=dimensions.length;
        for(int i=0;i<n;i++){
            float k=(float)Math.sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
            if(k>=max){
            //System.out.print(k+" ");
                if(max==k)
                ans=Math.max(ans,dimensions[i][0]*dimensions[i][1]);
                else
                ans=dimensions[i][0]*dimensions[i][1];
                System.out.print(ans+" ");
                max=k;
            }
        }
        return ans;
    }
}