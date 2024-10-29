package Practise.Patterns;

import static java.lang.Math.abs;

public class Pattern15 {
    // rows                 stars     spaces
    //   0      *             1       4
    //   1     * *            2       3  1
    //   2    *   *           2       2  3
    //   3   *     *          2       1  5
    //   4  *       *         2       0  7
    //   5   *     *          2       1  5
    //   6    *   *           2       2  3
    //   7     * *            2       3  1
    //   8      *             1       4
    public static void main(String[] args) {
        pattern15(5);
    }
    public static void pattern15(int n){
        for(int rows=0; rows<2*n-1;rows++){
            int totalNoOfSpaces = rows<n ? n-rows-1 : rows-n+1;
            for (int spaces=0; spaces<totalNoOfSpaces; spaces++){
                System.out.print(" ");
            }
            if(rows==0 || rows == 2*n-2){
                System.out.print("*");
            }else {
                System.out.print("*");//left star
                int spacesBtwn = rows<n ? 2*rows-1 : 2*(2*n-rows-2)-1;
                for (int spaces = 0; spaces<spacesBtwn; spaces++){
                    System.out.print(" ");
                }
                System.out.print("*");//right// star
            }
            System.out.println();
        }
    }
}
