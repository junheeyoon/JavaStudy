class Solution {
    public void gameOfLife(int[][] board) {
        int[][] result = new int[board.length][board[0].length];
        
        int[] ax = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] ay = {-1, 0, 1, 1, 1, 0, -1, -1};
        int nx, ny;
        int cnt = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                cnt = 0;
                if(i == 0 && j == 0){
                    for(int k = 3; k < 6; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else if(i == 0 && j == board[0].length-1){
                    for(int k = 5; k < 8; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else if(i == board.length-1 && j == 0){
                    for(int k = 1; k < 4; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else if(i == board.length-1 && j == board[0].length-1){
                    for(int k = 0; k < 2; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    for(int k = 7; k < 8; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else if(i == 0){
                    for(int k = 3; k < 8; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else if(i == board.length-1){
                    for(int k = 0; k < 4; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    for(int k = 7; k < 8; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else if(j == 0){
                    for(int k = 1; k < 6; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else if(j == board[0].length-1){
                    for(int k = 0; k < 2; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    for(int k = 5; k < 8; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
                else{
                    for(int k = 0; k < 8; k++){
                        nx = i + ax[k];
                        ny = j + ay[k];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length){
                            if(board[i][j] == 0){
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                            else{
                                if(board[nx][ny] == 1){
                                    cnt++;
                                }
                            }
                        }
                    }
                    if(board[i][j] == 0){
                        if(cnt == 3){
                            result[i][j] = 1;
                        }
                    }
                    else{
                        if(cnt < 2){
                            result[i][j] = 0;
                        }
                        else if(cnt >= 2 && cnt <= 3){
                            result[i][j] = 1;
                        }
                        else{
                            result[i][j] = 0;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = result[i][j];
            }
        }
    }
}
