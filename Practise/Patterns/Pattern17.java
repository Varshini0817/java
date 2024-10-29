package Practise.Patterns;

public class Pattern17 {
    // rows             spaces               starting from row number to 1 and from 2  till row num
    //   1      1          4
    //   2     212         3
    //   3    32123        2
    //   4   4321234       1
    //   5    32123        2           2*n-rows (2*4-5) = starting from 3
    //   6     212         3
    //   7      1          4
    public static void main(String[] args) {
            pattern17(6);
    }
    public static void pattern17(int n){
        for(int rows = 1; rows<= 2*n-1; rows++){
            int totalSpaces = rows<n ? n-rows+1 : rows-n+1;
            for(int spaces = 0; spaces<totalSpaces; spaces++){
                System.out.print(" ");
            }
            int num = rows<n ? rows : 2*n-rows;

            for(int cols = num; cols>=1; cols--){
                System.out.print(cols);
            }
            for (int cols = 2; cols<=num; cols++){
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
