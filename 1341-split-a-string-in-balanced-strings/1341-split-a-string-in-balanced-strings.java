class Solution {
    public int balancedStringSplit(String s) {
        int r=0,l=0,c=0;
        for(int i=0;i<s.length();i++){
            if(r==l)
            c++;
            if(s.charAt(i)=='R')
            r++;
            else
            l++;
        }
        return c;
    }
}