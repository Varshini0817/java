package Practise.Patterns;

public class Pattern18 {
    //n=5
    // rows                  stars  spaces
    //  0    **********       5 5       0
    //  1    ****  ****       4 4       2
    //  2    ***    ***       3 3       4
    //  3    **      **       2 2       6
    //  4    *        *       1 1       8
    //  5    *        *       1 1       8
    //  6    **      **       2 2       6
    //  7    ***    ***       3 3       4
    //  8    ****  ****       4 4       2
    //  9    **********       5 5       0

    public static void main(String[] args) {
        pattern18(5);
    }
    public static void pattern18(int n){
        for(int rows = 0; rows<2*n ; rows++){
            int noOfStars = rows<n ? n-rows : rows-n+1;
            for(int stars = 0 ; stars<noOfStars; stars++){
                System.out.print("*");
            }
            int noOfSpaces = rows<n ? 2*rows : (n-noOfStars)*2;
            for (int spaces = 0; spaces<noOfSpaces; spaces++){
                System.out.print(" ");
            }
            for(int stars = 0 ; stars<noOfStars; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
