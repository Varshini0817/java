package Practise.Recursion.Strings.BackTracking.Probs;

public class SudokuLC {

        public static void main(String[] args) {
            int[][] board = new int[][]{
                    {5,3,0,0,7,0,0,0,0},
                    {6,0,0,1,9,5,0,0,0},
                    {0,9,8,0,0,0,0,6,0},
                    {8,0,0,0,6,0,0,0,3},
                    {4,0,0,8,0,3,0,0,1},
                    {7,0,0,0,2,0,0,0,6},
                    {0,6,0,0,0,0,2,8,0},
                    {0,0,0,4,1,9,0,0,5},
                    {0,0,0,0,8,0,0,7,9}
            };

            if (solve(board)) {
                display(board);
            } else {
                System.out.println("Cannot solve");
            }
        }

        public static void display(int[][] board){
            for(int[] row : board){
                for(int ele: row){
                    System.out.print(ele+" ");
                }
                //System.out.println("\n"+"-".repeat(board.length*2));
                System.out.println();
            }
            System.out.println();
        }
        static boolean solve(int[][] board){
            int n = board.length;
            int row = -1, col = -1;

            boolean emptyLeft = true;

            for(int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    if(board[i][j] == 0){
                        row = i;
                        col = j;
                        emptyLeft = false;
                        break;
                    }
                }
                //if any row element is false , then break
                if(!emptyLeft){
                    break;
                }
            }

            //sudoku is solved
            if (emptyLeft){
                return true;
            }

            //backtrack
            for(int num = 1; num<=9; num++){
                if(isSafe(board,row,col,num)){
                    board[row][col] = num;
                    if(solve(board)){
                        return true;
                    }
                    else {
                        board[row][col]=0;
                    }
                }
            }
            return false;
        }

        private static boolean isSafe(int[][] board, int row, int col, int number) {
            //check the row
            for(int i= 0; i< board.length; i++){
                if(board[row][i] == number){
                    return false;
                }
            }

            // check the column
            for(int i=0; i<board.length; i++){
                if(board[i][col] == number){
                    return false;
                }
            }

            //check 3x3 grid if n = 9
            int sqrt = (int)(Math.sqrt(board.length));

            int rowStart = row - row % sqrt;
            int colStart = col - col % sqrt;
            for(int i= rowStart; i< rowStart+sqrt; i++){
                for (int j= colStart; j< colStart+sqrt; j++){
                    if(board[i][j] == number){
                        return false;
                    }
                }
            }
            return true;
        }
    }

