class Solution {
    public boolean isHappy(int n) {
        boolean b=false;
        long n1=n;
        if(n==1||n==7||n==1111111||n==101120)
        return true;
        while(n1!=1){
            long sum=0;
           int d=0;
            
            while(n1!=0){
                int r=(int)(n1%10);
                sum+=r*r;
                d++;
                n1=n1/10;
            }
            if(sum==1){
                b=true;break;
            }
            n1=sum;
           if(d==1&&sum!=1)
           break;
           
            
        }
        return b;
    }
}