class Solution {
    public boolean doesAliceWin(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                c++;
            }
        }
        System.out.print(c);
        if(c==0)return false;
       // if(c==1||c==3||c==5||c%2==0)
        return true;
       // return false;
    }
}