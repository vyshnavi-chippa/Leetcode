class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i]))
            return words[i];
        }
        return "";
    }
    public boolean isPalindrome(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str.equals(s);
    }
}