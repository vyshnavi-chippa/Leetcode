class Solution {
    public int pivotInteger(int n) {
        if(n==1)
        return 1;
        int pf[]=new int[n];
        pf[0]=1;
        for(int i=0;i<n-1;i++){
            pf[i+1]=pf[i]+(i+2);
        }
        int c=0;
        for(int i=n-1;i>0;i--){
            c+=(pf[i]-pf[i-1]);
            if(c==pf[i])
            return i+1;
        }
        return -1;
    }
}