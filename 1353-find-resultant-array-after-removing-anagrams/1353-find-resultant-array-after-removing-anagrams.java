class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> st=new Stack<>();
        st.push(words[0]);
        char ch1[]=words[0].toCharArray();
        Arrays.sort(ch1);
        String st1=new String(ch1);
        for(int i=1;i<words.length;i++){;
            char ch2[]=words[i].toCharArray();
            Arrays.sort(ch2);
            String st2=new String(ch2);
            if(st1.equals(st2)){
                continue;
            }
            else{
                st.push(words[i]);
                char ch3[]=words[i].toCharArray();
                Arrays.sort(ch3);
                st1=new String(ch3);
               // System.out.println(st1);
            }
        }
        List<String> al=new ArrayList<>();
        while(!st.isEmpty()){
            al.add(st.pop());
        }
        Collections.reverse(al);
        return al;
    }
}