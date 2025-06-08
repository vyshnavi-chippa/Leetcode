class Solution {
    public List<Integer> lexicalOrder(int n) {
        int c=1;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(c);
            if(c*10<=n)
            c*=10;
            else{
                if(c>=n)
                c=c/10;
                c++;
                while(c%10==0)
                c=c/10;
            }
        }
        return al;
    }
}