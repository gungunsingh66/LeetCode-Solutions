class Solution {
    private boolean[][] rows = new boolean[9][10];
    private boolean[][] cols = new boolean[9][10];
    private boolean[][] boxes = new boolean[9][10];

    public boolean backtrack(char[][] board){

        for(int i = 0 ; i< 9 ; i++){
            for(int j = 0; j<9 ; j++){
                if(board[i][j] == '.'){
                    int boxIndex = (i/3) * 3 + (j/3);
                    for(int digit = 1 ; digit <= 9 ; digit++){
                        if( !rows[i][digit] && !cols[j][digit] && !boxes[boxIndex][digit]){
                            board[i][j] = (char)(digit + '0');
                            rows[i][digit] = true;
                            cols[j][digit] = true;
                            boxes[boxIndex][digit] = true;

                            if(backtrack(board)) return true;
                            board[i][j] = '.';
                            rows[i][digit] = false;
                            cols[j][digit] = false;
                            boxes[boxIndex][digit] = false;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    // public boolean isValid(char[][] board, int row , int col,char ch){

    //     for(int i = 0 ; i<9; i++){
    //         if(board[row][i]== ch || board[i][col] == ch){
    //             return false;
    //         }
    //     }
    //     int startrow = (row/3) * 3;
    //     int startcol = (col/3) * 3;
    //     for(int i = startrow; i<startrow+3; i++){
    //         for(int j = startcol; j<startcol+3; j++){
    //             if(board[i][j] == ch){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    // public boolean backtrack(char[][] board){

    //     for(int i = 0 ; i< 9 ; i++){
    //         for(int j = 0; j<9 ; j++){
    //             if(board[i][j] == '.'){
    //                 for(char ch = '1' ; ch <= '9' ; ch++){
    //                     if(isValid(board ,i, j ,ch)){
    //                         board[i][j] = ch;

    //                         if(backtrack(board)) return true;
    //                         board[i][j] = '.';
    //                     } 
    //                 }
    //                return false;
    //             }

    //         }
    //     }
    //     return true;
    // }
    public void solveSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    int num = board[r][c] - '0';
                    int b = (r / 3) * 3 + (c / 3);
                    rows[r][num] = true;
                    cols[c][num] = true;
                    boxes[b][num] = true;
                }
            }
        }
        backtrack(board);
    }
}