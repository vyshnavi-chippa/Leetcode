class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(int j=0;j<words.length;j++){
            String s=words[j];
            boolean f=true;;
            for(int i=0;i<s.length();i++){
                if(allowed.contains(String.valueOf(s.charAt(i))))
                continue;
                else{
                    f=false;
                    break;
            }
        }
         if(f) ans++;
    }
        return ans;}
}