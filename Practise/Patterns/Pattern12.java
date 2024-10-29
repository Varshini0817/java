package Practise.Patterns;

public class Pattern12 {
    //rows              stars   spaces
    //  0   * * * * *     5        0
    //  1    * * * *      4        1
    //  2     * * *       3        2
    //  3      * *        2        3
    //  4       *         1        4
    //  5       *         1        4
    //  6      * *        2        3
    //  7     * * *       3        2
    //  8    * * * *      4        1
    //  9   * * * * *     5        0
    public static void main(String[] args) {
        pattern11(5);
    }
    public static void pattern11(int n){
        for(int rows=0; rows<2*n; rows++){
            int totalNoOfSpaces = rows<n ? rows : 2*n-rows-1;
            for(int spaces =0; spaces<totalNoOfSpaces; spaces++ ){
                System.out.print(" ");
            }
            int stars = rows<n ? n-rows : rows-n+1;
            for(int cols=0; cols<stars; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
