class Solution {
    public int maxOperations(String s) {
        int ans=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c+=1;
            }
            
            if(i<s.length()-1&&s.charAt(i)=='0'&&s.charAt(i+1)=='1'){
                ans+=c;
            }
        }
        if(s.charAt(s.length()-1)=='0')
        ans+=c;
        return ans;
    }
}