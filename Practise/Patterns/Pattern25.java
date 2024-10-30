package Practise.Patterns;

public class Pattern25 {
    // rows                 spaces stars
    //  0        *****        4     5
    //  1       *   *         3 3   1 1
    //  2      *   *          2 3   1 1
    //  3     *   *           1 3   1 1
    //  4    *****            0     5
    public static void main(String[] args) {
        pattern25(5);
    }
    public static void pattern25(int n){
        for(int rows =0; rows< n; rows++){
            for (int spaces = 0; spaces< n-1-rows; spaces++){
                System.out.print(" ");
            }
            if(rows == 0 || rows == n-1){
                System.out.print("*".repeat(n));
            }
            else {
                System.out.print("*"+" ".repeat(n-2)+"*");
            }
            System.out.println();
        }
    }
}
