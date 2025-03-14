class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&&s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String str="";
        if(st.isEmpty()){
            return str;
        }
        else{
            while(!st.isEmpty())
            str+=st.pop();
            StringBuilder s3=new StringBuilder(str);
            StringBuilder sb=s3.reverse();
            String s2=sb.toString();
            return s2;
        }
        
    }
}