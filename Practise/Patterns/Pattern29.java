package Practise.Patterns;

public class Pattern29 {
    // rows                     stars   spaces
    //   1    *        *         1 1      8
    //   2    **      **         2 2      6
    //   3    ***    ***         3 3      4
    //   4    ****  ****         4 4      2
    //   5    **********         5 5      0
    //   6    ****  ****         4 4      2
    //   7    ***    ***         3 3      4
    //   8    **      **         2 2      6
    //   9    *        *         1 1      8
    public static void main(String[] args) {
        pattern29(5);
    }
    public static void pattern29(int n){
        for(int rows = 1; rows<=2*n-1; rows++){
            int totalNoOfSpaces = rows<=n ? (n-rows)*2 : (rows-n)*2;
            int noOfStars = rows<=n ? rows : 2*n-rows;
            System.out.print("*".repeat(noOfStars)+" ".repeat(totalNoOfSpaces)+"*".repeat(noOfStars));
            System.out.println();
        }
    }
}
