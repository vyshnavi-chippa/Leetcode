class Solution {
    public String largestGoodInteger(String s) {
        char d='0';
        int c=0;
        boolean flag=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
                if(c==2&&d<=s.charAt(i)){
                    d=s.charAt(i);flag=true;
                }
            }
            else{
                c=0;
            }
        }
        String str="";
        if(!flag)
        return str;
        for(int i=0;i<3;i++){
            str+=d;
        }
        return str;
    }
}