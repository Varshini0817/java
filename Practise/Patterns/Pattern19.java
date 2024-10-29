package Practise.Patterns;

public class Pattern19 {
    //rows                      stars   spaces
    //  1     *        *         1 1       8
    //  2     **      **         2 2       6
    //  3     ***    ***         3 3       4
    //  4     ****  ****         4 4       2
    //  5     **********         5 5       0
    //  6     ****  ****         4 4       2
    //  7     ***    ***         3 3       4
    //  8     **      **         2 2       6
    //  9     *        *         1 1       8

    public static void main(String[] args) {
        pattern19(5);
    }
    public static void pattern19(int n){
        for(int rows=1; rows<2*n; rows++){
            int noOfStars = rows<n ? rows : 2*n-rows;
            for(int stars=0; stars<noOfStars; stars++){
                System.out.print("*");
            }
            int noOfSpaces = rows<n ? (n-rows)*2 : (rows-n)*2;
            for (int spaces = 0; spaces<noOfSpaces; spaces++){
                System.out.print(" ");
            }
            for (int stars =0; stars<noOfStars; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
