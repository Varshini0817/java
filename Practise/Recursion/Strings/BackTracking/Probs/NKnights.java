package Practise.Recursion.Strings.BackTracking.Probs;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        knights(board,0,0,n);
        System.out.println(count);

    }
    public static int count = 0;
    public static void knights(boolean[][] board, int row, int col, int knights){

        if(knights == 0){
            display(board);
            return ;
        }

        //reaching the end
        if(row == board.length-1 && col == board.length )
        {
            return ;
        }
        //moving to next row
        if(col == board[0].length){
            knights(board, row+1, 0, knights);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            knights(board, row, col+1, knights-1);
            board[row][col] = false;
        }
            // not writing in else part because our code shd check for all posibilities
            //if not safe
            knights(board, row, col+1, knights);

    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        //(r-2, c-1)
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        //(r-2,c+1)
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        //(r-1, c+2)
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        //(r-1, c-2)
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

       return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col){
        if( row >= 0 && row < board.length && col>=0 && col < board.length){
            return true;
        }
        return false;
    }

    public static int display(boolean[][] board){

        for(boolean[] row : board){
            for(boolean col: row){
                if(col){
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
        return count++;
    }
}
