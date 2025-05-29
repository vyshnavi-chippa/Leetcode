class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        int c=0;
        for(int i=0;i<31;i++){
            c+=((res>>i)&1);
        }
        return c;
    }
}