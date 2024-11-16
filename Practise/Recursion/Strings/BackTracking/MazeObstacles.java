package Practise.Recursion.Strings.BackTracking;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        } ;
        mazeObs("",board, 0,0);
    }
    public static void mazeObs(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.print(p+" ");
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            mazeObs(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            mazeObs(p+'R',maze,r,c+1);
        }

    }
}
