package Practise.Patterns;

public class Pattern10 {
    // rows                 stars   spaces
    //  0       *             1        4
    //  1      * *            2        3
    //  2     * * *           3        2
    //  3    * * * *          4        1
    //  4   * * * * *         5        0
    public static void main(String[] args) {
        pattern10(5);
    }
    public static void pattern10(int n){
        for(int rows = 0; rows<n; rows++){
            for(int spaces = 0; spaces<n-rows-1; spaces++){
                System.out.print(" ");
            }
            for (int cols=0; cols<=rows; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
