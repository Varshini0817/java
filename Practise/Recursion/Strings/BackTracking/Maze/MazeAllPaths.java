package Practise.Recursion.Strings.BackTracking.Maze;

import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        } ;
        mazeAll("",board,0,0);
        System.out.println();
        int[][] path = new int[board.length][board[0].length];
        mazeAllPathsPrint("",board, path, 0,0, 1);
    }
    public static void mazeAll(String p, boolean[][] maze, int r, int c){
        if( r== maze.length-1 && c == maze[0].length-1){
            System.out.print(p+" ");
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]= false;

        //Down
        if( r < maze.length-1){
            mazeAll(p+'D',maze,r+1,c);
        }
        //Right
        if( c < maze[0].length-1){
            mazeAll(p+'R',maze,r,c+1);
        }
        //Up
        if( r > 0){
            mazeAll(p+'U',maze,r-1,c);
        }
        //Left
        if( c > 0){
            mazeAll(p+'L',maze,r,c-1);
        }
        maze[r][c]= true;
    }

    public static void mazeAllPathsPrint(String p, boolean[][] maze,int[][] path, int r, int c,int step){
        if( r== maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.print(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        path[r][c]=step;
        maze[r][c]= false;

        //Down
        if( r < maze.length-1){
            mazeAllPathsPrint(p+'D',maze,path,r+1,c,step+1);
        }
        //Right
        if( c < maze[0].length-1){
            mazeAllPathsPrint(p+'R',maze,path,r,c+1,step+1);
        }
        //Up
        if( r > 0){
            mazeAllPathsPrint(p+'U',maze,path,r-1,c,step+1);
        }
        //Left
        if( c > 0){
            mazeAllPathsPrint(p+'L',maze,path,r,c-1,step+1);
        }
        path[r][c]=0;
        maze[r][c]= true;
    }

}
