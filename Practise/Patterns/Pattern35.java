package Practise.Patterns;
public class Pattern35 {
    // rows               spaces
    //   1    1      1      6
    //   2    12    21      4
    //   3    123  321      2
    //   4    12344321      0

    public static void main(String[] args) {
        pattern35(4);
    }
    public static void pattern35(int n){
        for (int rows=1; rows<=n ; rows++){
            for (int cols = 1; cols<=rows; cols++){
                System.out.print(cols);
            }
            System.out.print(" ".repeat(2*(n-rows)));
            for (int cols = rows; cols>=1; cols--){
                System.out.print(cols);
            }
            System.out.println();
        }
    }
    
}
