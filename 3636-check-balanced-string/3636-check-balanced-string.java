class Solution {
    public boolean isBalanced(String num) {
        char ch[]=num.toCharArray();
        int o=0,e=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0)
                e+=Character.getNumericValue(ch[i]);
            else
                o+=Character.getNumericValue(ch[i]);
        }
        if(e==o)
            return true;
        else
            return false;
        
    }
}