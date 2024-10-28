package Practise.Patterns;

public class Pattern6 {
    //   n-row spaces
    //         *
    //        **
    //       ***
    //      ****
    //     *****
    public static void main(String[] args) {
        pattern6(5);
    }
    public static void pattern6(int n){
        for(int rows = 1; rows<=n; rows++){

            for(int space = 1; space<= n-rows; space++){
                System.out.print(" ");
            }
            for(int cols=1; cols<=rows; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
