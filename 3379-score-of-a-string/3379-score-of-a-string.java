class Solution {
    public int scoreOfString(String s) {
        char ch[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum=sum+(Math.abs(ch[i]-ch[i+1]));
        }
        return sum;
    }
}