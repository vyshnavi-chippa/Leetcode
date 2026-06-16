class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                String st=sb.toString();
                sb.append(st);
            }
            else if(s.charAt(i)=='%'){
                sb.reverse();
            }
            else if(s.charAt(i)=='*'){
                if(sb.length()!=0)
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}