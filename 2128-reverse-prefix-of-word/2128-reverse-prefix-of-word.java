class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<>();
        int j=word.length();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                j=i;
                st.push(word.charAt(i));
                break;
            }
            st.push(word.charAt(i));
        }
        if(j==word.length())
        return word;
        String s="";
        while(!st.isEmpty()){
            s+=st.pop();
        }
        
        for(int i=j+1;i<word.length();i++){
             s=s+word.charAt(i);
        }
        return s;
    }
}