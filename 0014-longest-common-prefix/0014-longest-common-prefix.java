class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<2){
            return strs[0];
        }
        else{
        Arrays.sort(strs,Comparator.comparingInt(String::length));
        int len=strs[0].length();
        String s="";
        for(int i=0;i<len;i++){
            int c=0;
            String ch="";
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)==strs[j+1].charAt(i)){
                    c=1;
                    if(j==strs.length-2){
                    ch=Character.toString(strs[j].charAt(i));
                    
                }}
                
                else{
                    c=0;
                break;}
            }
            if(c==0)
            break;
            else
            s+=ch;
        }
        return s;}
    }
}