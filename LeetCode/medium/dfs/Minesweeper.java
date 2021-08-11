class Solution {
    
    int[] ax = {-1, 1, 0, 0};
    int[] ay = {0, 0, -1, 1};
    
    int[] cx = {-1, -1, -1, 0, 1, 1, 1, 0};
    int[] cy = {-1, 0, 1, 1, 1, 0, -1, -1};
    
    public char[][] updateBoard(char[][] board, int[] click) {
        int[][] visit = new int[board.length][board[0].length];
        
        int x = click[0];
        int y = click[1];
        
        if(board[x][y] == 'M'){
            board[x][y] = 'X';
            return board;
        }
        else if(board[x][y] == 'E'){
            dfs(x, y, visit, board);
            return board;
        }
        else{
            return board;
        }
    }
    
    public void dfs(int x, int y, int[][] visit, char[][] board){
        int cnt = 0;
        int nx;
        int ny;
        if(x == 0 && y == 0){
            for(int i = 3; i < 6; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        else if(x == 0 && y == board[0].length-1){
            for(int i = 5; i < 8; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        else if(x == board.length-1 && y == 0){
            for(int i = 1; i < 4; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        else if(x == board.length-1 && y == board[0].length-1){
            for(int i = 0; i < 2; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            for(int i = 7; i < 8; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        else if(x == 0){
            for(int i = 3; i < 8; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        else if(x == board.length-1){
            for(int i = 0; i < 4; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            for(int i = 7; i < 8; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        if(y == 0){
            for(int i = 1; i < 6; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        else if(y == board[0].length-1){
            for(int i = 0; i < 2; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            for(int i = 5; i < 8; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        else{
            for(int i = 0; i < 8; i++){
                nx = x + cx[i];
                ny = y + cy[i];
                if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                    if(board[nx][ny] == 'M'){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 0){
                board[x][y] = 'B';
            }
            else{
                board[x][y] = (char)(cnt+'0');
                return;
            }
        }
        for(int k = 0; k < 8; k++){
            
            nx = x + cx[k];
            ny = y + cy[k];
            if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                if(board[nx][ny] == 'E'){
                    dfs(nx, ny, visit, board);
                }    
            }
        }
    }
}
