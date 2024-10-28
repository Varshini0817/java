package Practise.Patterns;

public class Pattern5 {
    //  r c
    // (2n-1)r  2n-row
    //  1  *
    //  2  **
    //  3  ***
    //  4  ****
    //  5  *****
    //  6  ****
    //  7  ***
    //  8  **
    //  9  *
    public static void main(String[] args) {
        pattern5(5);
    }
    public static void pattern5(int n){
        for(int rows = 1; rows<=2*n-1; rows++){
            int totalColsInRow = rows > n ? 2*n-rows : rows;
            for(int cols = 1; cols<=totalColsInRow; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
