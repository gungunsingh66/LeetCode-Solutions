class Solution {
    public boolean isValid(char[][] board, int row , int col,char ch){
        //row check
        for(int i = 0 ; i<9; i++){
            if(board[row][i]== ch){
                return false;
            }
        }
        //col check
        for(int j = 0 ; j<9 ; j++){
            if(board[j][col] == ch){
                return false;
            }
        }
        //subgrid check
        int startrow = (row/3) * 3;
        int startcol = (col/3) * 3;
        for(int i = startrow; i<startrow+3; i++){
            for(int j = startcol; j<startcol+3; j++){
                if(board[i][j] == ch){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean backtrack(char[][] board){

        for(int i = 0 ; i< 9 ; i++){
            for(int j = 0; j<9 ; j++){
                if(board[i][j] == '.'){
                    for(char ch = '1' ; ch <= '9' ; ch++){
                        if(isValid(board ,i, j ,ch)){
                            board[i][j] = ch;

                            if(backtrack(board)) return true;
                            board[i][j] = '.';
                        } 
                    }
                   return false;
                }
                
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }
}