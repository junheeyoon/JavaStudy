class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length; i++){
            boolean[] m = new boolean[10];
            for(int j = 0; j < board.length; j++){
                
                if(board[i][j] != '.'){
                    if(m[(int)board[i][j] - '0']){
                        return false;
                    }
                    m[(int)board[i][j] - '0'] = true;
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            boolean[] m = new boolean[10];
            for(int j = 0; j < board.length; j++){
                
                if(board[j][i] != '.'){
                    if(m[(int)board[j][i] - '0']){
                        return false;
                    }
                    m[(int)board[j][i] - '0'] = true;
                }
            }
        }
        //check each 3*3 matrix
        for (int block = 0; block < 9; block++) {
            boolean[] m = new boolean[10];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        if (m[(int) (board[i][j] - '0')]) {
                            return false;
                        }
                        m[(int) (board[i][j] - '0')] = true;
                    }
                }
            }
        }

        return true;
    }
}
