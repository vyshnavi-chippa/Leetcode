class Solution {
    public char kthCharacter(int k) {
        char ch[]=new char[600];
        ch[0]='a';
        int n=1,i=0;
       while(n<=k){
            int t=n;
        for(i=0;i<t;i++){
           ch[n++]=(char)(ch[i]+1);
        }
        }

        return  ch[k-1];
    }
}