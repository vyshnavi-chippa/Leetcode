class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        long sum=maximumHeight[maximumHeight.length-1];
        int a=maximumHeight[maximumHeight.length-1];
        for(int i=maximumHeight.length-2;i>=0;i--){
            if(a<=maximumHeight[i]){
                maximumHeight[i]=a-1;
            }
            sum=sum+maximumHeight[i];
             a=maximumHeight[i];
             if(a==0){
                int k=-1;
                return k;
             }
        }
        return sum;
    }
}