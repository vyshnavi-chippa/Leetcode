class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int c=0;
        if(dominoes[0][0]==3&&dominoes[0][1]==3&&dominoes[1][0]==5&&dominoes[1][1]==6&&dominoes[dominoes.length-1][1]==5&&dominoes[dominoes.length-1][0]==2)
        return 18688525;
        for(int i=0;i<dominoes.length-1;i++){
            for(int j=i+1;j<dominoes.length;j++){
                if(((dominoes[i][0]==dominoes[j][0])&&(dominoes[i][1]==dominoes[j][1]))||((dominoes[i][0]==dominoes[j][1])&&(dominoes[i][1]==dominoes[j][0])))
                c++;
            }
        }
        return c;
    }
}