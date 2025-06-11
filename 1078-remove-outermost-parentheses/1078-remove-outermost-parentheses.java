class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int i=0;
        for(i=0;i<n;i++){
            int c1=0,c2=0;
            do{
                if(s.charAt(i)=='(')
                c1++;
                else
                c2++;
                st.push(s.charAt(i));
                i++;
            }while(c1!=c2);
            if(c1==c2){
            while(!st.isEmpty()){
                sb2.append(st.pop());
            }
            sb2.reverse();
            sb.append(sb2.substring(1,sb2.length()-1));
            }
            i--;
            sb2.setLength(0);
        }
        return sb.toString();
    }
}