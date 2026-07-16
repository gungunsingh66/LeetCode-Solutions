class Solution {
    List<List<String>> answer = new ArrayList<>();
    public boolean isSafe(char[][] board,int row, int col){
        for(int i=row-1; i>=0 ; i--){
            if(board[i][col]=='Q'){
                    return false;
                }
        }
        for(int i = row-1, j=col-1; i>=0 && j>=0 ; i--, j--){
            if(board[i][j]=='Q' ){
                    return false;
                }
        }
        for(int i = row-1, j=col+1; i>=0  && j<board.length; i--, j++){ 
            if(board[i][j]=='Q' ){
                return false;
            }
        }
        return true;
    }
    public void backtrack(char[][] board, int row , int n){
        if(row == n){
            List<String> solution = new ArrayList<>();
            for(int i = 0; i<n; i++){
                solution.add(new String(board[i]));
            }
            answer.add(solution);
            return;
        }
        for(int col=0 ; col<n ; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                backtrack(board, row+1, n );
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<n; j++){
                board[i][j] = '.';
            }
        }
        backtrack(board , 0, n);
        return answer;
    }
}