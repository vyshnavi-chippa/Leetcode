class Solution {
    public int smallestNumber(int n) {
         String b=Integer.toBinaryString(n);
        int bl=b.length();
        int setbit=(1 << bl)-1;
        return setbit;
    }
}