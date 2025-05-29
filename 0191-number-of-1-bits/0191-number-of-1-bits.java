class Solution {
    public int hammingWeight(int n) {
        int c=0;
        for(int i=0;i<31;i++){
            c+=((n>>i)&1);
        }
        return c;
    }
}