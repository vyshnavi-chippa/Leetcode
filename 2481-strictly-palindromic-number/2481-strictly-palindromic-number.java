class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s=Integer.toString(n,i);
            StringBuilder sb=new StringBuilder(s);
            String s2=sb.reverse().toString();
            if(!(s.equals(s2)))
            return false;
        }
        return true;
    }
}