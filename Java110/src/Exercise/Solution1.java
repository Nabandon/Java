package Exercise;
import java.util.Scanner;
public class Solution1 {
    public int numRookCaptures(char[][] board) {
        int i=0,j=0;
        outer:
        for( i=0;i<8;i++){
            for( j=0;j<8;j++){
                if(board[i][j]=='R'){
                    break outer;
                }
            }
        }
        int count=0;
        //往东
        for(int k=i;k<8;k++){
            if(board[k][j]=='p'){
                count++;
                break;
            }
            if(board[k][j]=='B'){
                break;
            }
        }
        //往西
        for(int k=i;k>=0;k--){
            if(board[k][j]=='p'){
                count++;
                break;
            }
            if(board[k][j]=='B'){
                break;
            }
        }
        //往南
        for(int k=j;k<8;k++){
            if(board[i][k]=='p'){
                count++;
                break;
            }
            if(board[i][k]=='B'){
                break;
            }
        }
        for(int k=j;k>=0;k--){
            if(board[i][k]=='p'){
                count++;
                break;
            }
            if(board[i][k]=='B'){
                break;
            }
        }
        return count;
    }
}

