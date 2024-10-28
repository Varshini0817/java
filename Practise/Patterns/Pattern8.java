package Practise.Patterns;

public class Pattern8 {
    // rows         stars  spaces
    //  1     *      1      4
    //  2    ***     3      3
    //  3   *****    5      2
    //  4  *******   7      1
    //  5 *********  9      0

    public static void main(String[] args) {
        pattern8(5);
    }
    public static void pattern8(int n){
        for(int rows=0; rows<n; rows++){
            for(int spaces = 0; spaces<n-rows-1; spaces++ ){
                System.out.print(" ");
            }
            for (int cols = 0; cols< 2*rows+1; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
