class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int s=0;
            for(int k=l;k<=r;k++){
                if(i+k<=n){
                    for(int j=i;j<i+k;j++)
                        s+=nums.get(j);
                    if(s>0)
                        min=Math.min(s,min);
                    s=0;
                }
            }
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        else
            return min;
    }
}