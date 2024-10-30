package Practise.Patterns;

public class Pattern24 {
    //rows                      stars     spaces
    // 1      *        *        1   1       8
    // 2      **      **        2   2      0 6 0
    // 3      * *    * *        2   2      1 4 1
    // 4      *  *  *  *        2   2      2 2 2
    // 5      *   **   *        2   2      3 0 3
    // 6      *   **   *        2   2      3 0 3
    // 7      *  *  *  *        2   2      2 2 2
    // 8      * *    * *        2   2      1 4 1
    // 9      **      **        2   2      0 6 0
    // 10     *        *        1   1        8
    public static void main(String[] args) {
        pattern25(5);
    }
    public static void pattern25(int n){
        for(int rows=1; rows<=2*n; rows++){
            if(rows == 1 || rows == 2*n){
                System.out.print("*"+" ".repeat((n-1)*2)+"*");
            }
            else{
                int noOfSpaces = rows <= n ? rows-2 : 2*n - rows -1;//left
                System.out.print("*"+" ".repeat(noOfSpaces));

                System.out.print("*");//2nd star left
                int noOfSpacesBtwn = rows <= n ? (n-rows)*2 : 2*(rows-n)-2;//middle
                System.out.print(" ".repeat(noOfSpacesBtwn));//middle spaces
                System.out.print("*"+" ".repeat(noOfSpaces)+"*");//right
            }
            System.out.println();
        }
    }
}
