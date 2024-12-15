class Solution {
    public String defangIPaddr(String address) {
        char ch[]=new char[25];
        char c[]=address.toCharArray();
        int j=0;
        for(int i=0;i<address.length();i++){
            if(c[i]=='.'){
                ch[j++]='[';
                ch[j++]='.';
                ch[j++]=']';
            }
            else
            ch[j++]=c[i];
        }
        String s=new String(ch,0,j);
        return s;
    }
}