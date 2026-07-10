class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char w = word.charAt(0);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(w==board[i][j]){
                   if(backtrack(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    boolean backtrack(char[][] board, String word, int i, int j,int idx){
        if(idx==word.length()) return true;
        int m = board.length;
        int n = board[0].length;
        if(i<0|| i>=m || j<0|| j>=n|| board[i][j]!=word.charAt(idx)){
            return false;
        }
        char c = board[i][j];
        board[i][j] = '#';
        boolean flag = backtrack(board, word, i+1,j,idx+1)||
                        backtrack(board, word, i-1,j,idx+1)||
                        backtrack(board, word, i,j+1,idx+1)||
                        backtrack(board, word, i,j-1,idx+1);
        board[i][j] = c;
        return flag;
    }
}
