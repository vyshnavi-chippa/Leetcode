class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String s[]=text.split(" ");
        int c=0;
        for(int j=0;j<s.length;j++){
            char str[]=s[j].toCharArray();
            HashSet<Character> hs=new HashSet<>();
            for(int i=0;i<str.length;i++){
                hs.add(str[i]);
            }
            for(int i=0;i<brokenLetters.length();i++){
                if(hs.contains(brokenLetters.charAt(i))){
                    c++;break;
                }
            }
        }
        return s.length-c;
    }
}