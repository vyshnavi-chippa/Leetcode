class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int m=n;
            int i;
            int p=1;
            int a[]=new int[10000];
            for(i=0;m!=0;i++){
                a[i]=m%10;
                m=m/10;
            }
            for(int j=0;j<i;j++){
                p=a[j]*p;
            }
            if(p%t==0){
                return n;
            }
            else{
                n++;
            }
        }
    }
}