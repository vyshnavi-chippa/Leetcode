class Solution {
    public int reverse(int x) {
        int rem=0,r=0;
        while(x!=0){
            rem=x%10;
            
            if (r > Integer.MAX_VALUE / 10 || (r== Integer.MAX_VALUE / 10 && rem> 7)) {
                return 0; 
            }
            if (r < Integer.MIN_VALUE / 10 || (r ==  Integer.MIN_VALUE/ 10 && rem < -8)) {
                return 0; 
            }
            r=r*10+rem;
            x=x/10;
        }
   
        return r;
    }
}