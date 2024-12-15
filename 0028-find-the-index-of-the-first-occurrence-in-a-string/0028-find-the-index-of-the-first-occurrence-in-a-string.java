class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
                int i=0,j=0,t=0;
            for(i=0;i<haystack.length();i++){
                 t=i;
                while (haystack.charAt(t)==needle.charAt(j)){
                    j++;
                    t++;
                    if(j==needle.length())
                    break;
                }
                if(j==needle.length())
                    break;
                    else
                j=0;
                
            }
            return i;
        }
        else{
            return -1;
        }
       // return 0;
    }
}