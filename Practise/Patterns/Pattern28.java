package Practise.Patterns;

public class Pattern28 {
    //rows 2*n-1
    // spaces                    stars      rows
    //  4       *                 1           0
    //  3      * *                2           1
    //  2     * * *               3           2
    //  1    * * * *              4           3
    //  0   * * * * *             5           4
    //  1    * * * *              4           5
    //  2     * * *               3           6
    //  3      * *                2           7
    //  4       *                 1           8

    public static void main(String[] args) {
        pattern28(5);
    }
    public static void pattern28(int n){
        for (int rows = 0; rows<2*n-1;  rows++){
            int noOfSpaces = rows<n ? n-rows-1 : rows+1-n;
            int noOfStars = rows<n ? rows +1 : n-noOfSpaces;
            System.out.print(" ".repeat(noOfSpaces)+"* ".repeat(noOfStars));
            System.out.println();
        }
    }

}
