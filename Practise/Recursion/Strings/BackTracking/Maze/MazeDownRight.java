package Practise.Recursion.Strings.BackTracking.Maze;

import java.util.ArrayList;

public class MazeDownRight {
    public static void main(String[] args) {
        int r = 3, c = 3;
        System.out.println(maze(r,c));
        pathRet("",r,c);
        System.out.println("\n"+pathRetArr("",r,c));
    }
    public static int maze(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left = maze(r-1,c);
        int right = maze(r,c-1);

        return left + right;
    }

    // printing paths
    public static void pathRet(String p, int r, int c){
        if(r==1 && c==1){
            System.out.print(p+" ");
            return;
        }
        if(r>1){
            pathRet(p+'D', r-1,c);
        }
        if(c>1){
            pathRet(p+'R',r,c-1);
        }
    }

    //Paths in the form a list
    public static ArrayList<String> pathRetArr(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRetArr(p+'D', r-1,c));
        }
        if(c>1){
            list.addAll(pathRetArr(p+'R',r,c-1));
        }
        return list;
    }
}