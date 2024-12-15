class Solution {
    public int countPrimes(int n) {
        boolean isp[]=new boolean[n+1];
        for(int i=2;i<=n;i++)
        isp[i]=true;
        for(int i=2;i*i<=n;i++){
            if(isp[i]){
                for(int j=i*i;j<=n;j=i+j){
                    isp[j]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(isp[i])
            c++;
        }
        return c;
    }
}