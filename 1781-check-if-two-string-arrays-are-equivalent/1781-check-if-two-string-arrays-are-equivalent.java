class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(int i=0;i<word1.length;i++){
            for(int j=0;j<word1[i].length();j++){
                s1=s1+word1[i].charAt(j);
            }
        }
        for(int i=0;i<word2.length;i++){
            for(int j=0;j<word2[i].length();j++){
                s2=s2+word2[i].charAt(j);
            }
        }
        return s1.equals(s2);
    }
}