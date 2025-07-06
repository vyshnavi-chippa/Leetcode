class Solution {
    public String truncateSentence(String s, int k) {
        String ch[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(ch[i]);
            if(i<k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}