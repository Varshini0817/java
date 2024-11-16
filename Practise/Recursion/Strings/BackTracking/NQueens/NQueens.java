package Practise.Recursion.Strings.BackTracking.NQueens;

public class NQueens {
    //not in the same row, same col, same diagonal
    public static void main(String[] args) {
        int n = 6;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }
    public static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col = 0; col<board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]= true;
                count+= queens(board,row+1);
                board[row][col]= false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        //check for col
        for(int i=row;i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }
        //check left diagonally
        int maxLeft = Math.min(row,col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //check right diagonally
        int maxRight = Math.min(row, ((board[0].length-1)-col));
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean ele: row){
                if(ele){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
