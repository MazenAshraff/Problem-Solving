
public class ValidSudoko {
	/*
	 * Problem Statement : https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/
	 */
	int k[][]={{0,1,2},{3,4,5},{6,7,8}};
    public boolean isValidSudoku(char[][] board) {
        int [][] rows=fill(board,1);
        int [][] cols = fill(board,2);
        int smallboxes [][]= fill(board,3);
        return check(rows)&&check(cols)&&check(smallboxes);
    }
    public boolean check(int [][] suspect){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(suspect[i][j]>1)
                    return false;
            }
        }
        return true;
    }
    public int [][] fill(char [][]board,int type){
        int filled[][]= new int[9][9];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]>='1'&&board[i][j]<='9'){
                    if(type == 1)
               filled[i][Integer.parseInt(board[i][j]+"")-1]++;
                    else if (type == 2)
                        filled[j][Integer.parseInt(board[i][j]+"")-1]++;
                    else 
                        filled[getPos(i,j)][Integer.parseInt(board[i][j]+"")-1]++;
                        
                }
            }
        }
        return filled;
    }
    public int getPos(int i,int j){
        return k[i/3][j/3];
    }
}
