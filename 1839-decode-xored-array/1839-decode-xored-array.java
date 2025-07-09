class Solution {
    public int[] decode(int[] encoded, int first) {
       int a[]=new int[encoded.length+1];
       a[0]=first;
       for(int i=1;i<=encoded.length;i++){
            a[i]=a[i-1]^encoded[i-1];
       } 
       return a;
    }
}