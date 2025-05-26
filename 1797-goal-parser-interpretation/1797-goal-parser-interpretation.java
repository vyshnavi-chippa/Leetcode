class Solution {
    public String interpret(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('&&s.charAt(i+1)==')')
            sb.append("o");
            else if(s.charAt(i)=='a'||s.charAt(i)=='l'||s.charAt(i)=='G')
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}