package Practise.Patterns;

public class Pattern13 {
    //  rows            stars    spaces
    //   0      *         1        4
    //   1     * *        2        3    1
    //   2    *   *       2        2    3
    //   3   *     *      2        1    5
    //   4  *********     9        0
    public static void main(String[] args) {
        pattern13(5);
    }
    public static void pattern13(int n){
        for(int rows=0; rows<n; rows++){
            for(int spaces = 0 ; spaces < n-rows-1; spaces++){
                System.out.print(" ");//left spaces
            }
            if(rows==0){    //first row only 1 star
                System.out.print("*");
            } else if (rows==n-1) { //last row 2*n-1 stars
                for (int stars = 0; stars<2*n-1; stars++){
                    System.out.print("*");
                }
            }else {
                System.out.print("*"); //left star
                for(int spaces = 0; spaces< 2*rows-1; spaces++ ){
                    System.out.print(" ");//middle spaces
                }
                System.out.print("*");//right star
            }
            System.out.println();
        }
    }
}
