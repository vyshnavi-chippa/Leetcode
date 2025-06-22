class Solution {
    public String[] divideString(String s, int k, char fill) {
        int r=s.length()%k;
        int q=s.length()/k;
        int len=q;
        if(r!=0)
        len=(q+1);
        String a[]=new String[len];
        int i=0,idx=0;
        for(i=0;i<=s.length()-k;i=i+k){
            StringBuilder sb=new StringBuilder(s.substring(i,k+i));
            a[idx]=sb.toString();
            idx++;
        }
        if(i!=s.length()){
        StringBuilder sb=new StringBuilder(s.substring(i,s.length()));
        while(sb.length()<k){
            sb.append(fill);
        }
        a[idx]=sb.toString();
        }
        System.out.println(idx+" "+len+" "+i);
        return a;
    }
}