package Practise.Patterns;

public class Pattern9 {
    // rows            stars    spaces
    //  0 *********     9          0
    //  1  *******      7          1
    //  2   *****       5          2
    //  3    ***        3          3
    //  4     *         1          4

    public static void main(String[] args) {
        pattern9(5);
    }
    public static void pattern9(int n){
        for(int rows = 0; rows<n; rows++){
            for (int spaces = 0; spaces < rows; spaces++){
                System.out.print(" ");
            }
            for (int cols = 0; cols<2*(n-rows)-1; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
