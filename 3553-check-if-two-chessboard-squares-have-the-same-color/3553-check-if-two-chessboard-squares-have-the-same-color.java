class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int board[][]=new int[8][8];
        int rowStart=1;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j]=rowStart;
                rowStart=1-rowStart;
            }
            rowStart=1-rowStart;
        }
        int c1=coordinate1.charAt(0)-'a';
        int r1=coordinate1.charAt(1)-'0'-1;
        int c2=coordinate2.charAt(0)-'a';
        int r2=coordinate2.charAt(1)-'0'-1;
        return board[r1][c1]==board[r2][c2];

        
    }
}