class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!st.isEmpty())
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            
        }
        String str="";
        while(!st.isEmpty()){
            str+=String.valueOf(st.pop());
        }
        StringBuffer sb=new StringBuffer(str);
        
        return sb.reverse().toString();
    }
}