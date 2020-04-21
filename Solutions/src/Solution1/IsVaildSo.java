package Solution1;

public class IsVaildSo {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row=new boolean[9][9];
        boolean[][] col=new boolean[9][9];
        boolean[][] block=new boolean[9][9];
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]!='.'){
                    int num=board[r][c]-'1';
                    int blockIndex=r/3*3+c/3;
                    if(row[r][num]||col[c][num]||block[blockIndex][num]){
                        return false;
                    }else{
                        row[r][num]=true;
                        col[c][num]=true;
                        block[blockIndex][num]=true;
                    }
                }
            }
        }
        return true;
    }
}
