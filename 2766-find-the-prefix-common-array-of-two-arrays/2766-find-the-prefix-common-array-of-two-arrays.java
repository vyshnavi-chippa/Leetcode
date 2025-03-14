class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int ps[]=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<=i;j++){
                int num=A[j];
                for(int k=0;k<=i;k++){
                    if(num==B[k]){
                        c++;
                    }
                }
            }
            ps[i]=c;
        }
        return ps;
    }
}