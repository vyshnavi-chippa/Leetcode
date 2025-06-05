class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        char par[]=new char[26];
        int idx=0;
        for(char i='a';i<='z';i++){
            par[idx++]=i;
        }
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            char pc1=findParent(c1,par);
            char pc2=findParent(c2,par);
            if(pc1==pc2)
            continue;
            else if(pc1<pc2){
                par[pc2-97]=pc1;
            }
            else{
                par[pc1-97]=pc2;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<baseStr.length();i++){
            char pc=findParent(baseStr.charAt(i),par);
            sb.append(pc);
        }
        return sb.toString();
    }
    public char findParent(char x,char par[]){
        if(x==par[x-97])
        return x;
        return par[x-97]=findParent(par[x-97],par);
    }
}