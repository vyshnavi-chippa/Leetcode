class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> hm=new HashMap<>();
        Stack<Character> st=new Stack<>();
        hm.put('{','}');
        hm.put('(',')');
        hm.put('[',']');
        for(int i=0;i<s.length();i++){
        if(hm.containsKey(s.charAt(i)))
        st.push(s.charAt(i));
        
        else{ 
            if(st.isEmpty()||hm.get(st.pop())!=s.charAt(i))
            return false;
        
        }}
        return st.isEmpty();
    }
}