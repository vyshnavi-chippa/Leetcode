class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                str+=Character.toString(s.charAt(i));
            }
        }
        String str2=str.toLowerCase();
        StringBuilder sb=new StringBuilder(str2);
        String rev=sb.reverse().toString();
        if(str2.equals(rev))
        return true;
        else
        return false;
    }
}