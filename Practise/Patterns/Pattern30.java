package Practise.Patterns;

public class Pattern30 {
    //rows
    //  1          1
    //  2        2 1 2
    //  3      3 2 1 2 3
    //  4    4 3 2 1 2 3 4
    //  5  5 4 3 2 1 2 3 4 5
    public static void main(String[] args) {
        pattern30(5);
    }
    public static void pattern30(int n){
        for(int rows = 1; rows<=n ; rows++){
            for(int spaces=0; spaces<(n-rows)*2; spaces++){
                System.out.print(" ");
            }
            for(int cols = rows; cols>=1; cols--){
                System.out.print(cols+" ");
            }
            for (int cols = 2 ; cols<= rows ; cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
}
