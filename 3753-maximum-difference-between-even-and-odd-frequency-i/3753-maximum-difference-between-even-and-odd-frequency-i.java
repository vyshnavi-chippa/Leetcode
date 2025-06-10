class Solution {
    public int maxDifference(String s) {
        int c[]=new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-97]++;
        }
        int even=Integer.MAX_VALUE;
        int odd=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(c[i]==0)
            continue;
            else if(c[i]%2==0){
                even=Math.min(c[i],even);
            }
            else{
                odd=Math.max(c[i],odd);
            }
        }
        return odd-even;
    }
}