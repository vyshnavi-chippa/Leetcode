class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String ans[]=new String[str.length+1];
        String res="";
        int idx=0;
        for(String i:str){
            int k=Integer.parseInt(Character.toString(i.charAt(i.length()-1)));
            ans[k]=i.substring(0,i.length()-1);
        }
        for(int i=1;i<ans.length;i++){
            res+=ans[i];
            res+=" ";
        }
        String fin=res.substring(0,res.length()-1);
        return fin;
    }
}