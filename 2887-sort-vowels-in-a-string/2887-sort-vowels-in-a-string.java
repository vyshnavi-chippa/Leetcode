class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            al.add(s.charAt(i));
        }
        Collections.sort(al);
        int in=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                sb.append(al.get(in));
                in++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}