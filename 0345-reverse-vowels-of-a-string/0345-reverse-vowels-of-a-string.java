class Solution {
    public String reverseVowels(String s) {
        
        char ch[]=new char[s.length()];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            al.add(i);
            else
            ch[i]=s.charAt(i);
        }
        for(int i=0;i<al.size();i++){
            ch[al.get(i)]=s.charAt(al.get(Math.abs(al.size()-i-1)));
        }
        String str=String.valueOf(ch);
        return str;
    }
}