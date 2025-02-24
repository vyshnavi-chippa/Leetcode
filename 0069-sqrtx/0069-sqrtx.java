class Solution {
    long i=0;
    public int mySqrt(int x) {
        if(x==0||x==1)
        return x;
        return srt(x,i);
    }
    public int srt(int x,long i){
            if(i*i==x)
            return (int)i;
            if(i*i>x)
            return (int)i-1;
           
            return srt(x,i+1);
        
    }
}