class Solution {
    public int removeDuplicates(int[] a) {
        int n =a.length;
        int j=1;
        for(int i=1;i<n;i++){
            if(a[i]!=a[i-1]){
            a[j] = a[i];
            j++;
            }
        }
        
        

        return j;
       
        
    }
}