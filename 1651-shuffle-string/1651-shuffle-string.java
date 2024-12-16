class Solution {
    public String restoreString(String s, int[] indices) {
        String str="";
        int index=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<indices.length;j++){
                if(indices[j]==i){
                index=j;
                break;}
            }
            str=str+s.charAt(index);
        }
        return str;
    }
}