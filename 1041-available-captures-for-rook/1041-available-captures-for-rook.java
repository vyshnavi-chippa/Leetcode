class Solution {
    public int numRookCaptures(char[][] board) {
        int row=0,col=0,c=0;;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    row=i;
                    col=j;
                }
            }
        }
        for(int i=row+1;i<8;i++){
            
                if(board[i][col]=='.')
                continue;
                else if(board[i][col]=='B')
                break;
                else{
                    c++;
                    break;
                }
            
        }
        for(int i=row-1;i>=0;i--){
            
                if(board[i][col]=='.')
                 continue;
                 else if(board[i][col]=='B')
                 break;
                else{
                 c++;
                break;
                                                                                                                                        }
            
        }
        
            for(int j=col+1;j<8;j++){
                if(board[row][j]=='.')
                 continue;
            else if(board[row][j]=='B')
                break;
                else{
                c++;
                break;
                                                                                                                                        }
            }
        
        
            for(int j=col-1;j>=0;j--){
                if(board[row][j]=='.')
            continue;
                else if(board[row][j]=='B')
                 break;
                 else{
            c++;
                break;
                                                                                                                                        }
            }
        
        return c;
    }
}