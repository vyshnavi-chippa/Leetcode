class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        return false;
        boolean vowel=false,consonant=false;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='@'||word.charAt(i)=='$'||word.charAt(i)=='#')
            return false;
            else if(Character.isDigit(word.charAt(i)))
            continue;
            else if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='E'||word.charAt(i)=='A'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U')
            vowel=true;
            else
            consonant=true;
        }
        if(vowel&&consonant)
        return true;
        
        return false;

    }
}