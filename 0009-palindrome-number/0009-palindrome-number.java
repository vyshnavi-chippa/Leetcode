class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int n=x,rem=0,rev=0;
            while(n!=0){
                rem=n%10;
                rev=rem+rev*10;
                n=n/10;
            }
            if(x==rev)
            return true;
            else
            return false;
        }
    }
}