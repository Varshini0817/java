package Practise.Patterns;

public class Pattern11 {
    //rows               stars   spaces
    // 0    * * * * *      5        0
    // 1     * * * *       4        1
    // 2      * * *        3        2
    // 3       * *         2        3
    // 4        *          1        4

    public static void main(String[] args) {
        pattern11(5);
    }
    public static void pattern11(int n){
        for(int rows=0; rows<n; rows++){
            for(int spaces = 0; spaces<= rows; spaces++){
                System.out.print(" ");
            }
            for (int cols=0; cols<n-rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
