package Practise.Patterns;

public class Pattern7 {
    //rows, spaces , cols
    //     *****
    //      ****
    //       ***
    //        **
    //         *
    public static void main(String[] args) {
       pattern7(5);
    }
    public static void pattern7(int n){
        for(int rows = 0; rows<n; rows++){
            for(int spaces = 0; spaces < rows; spaces++ ){
                System.out.print(" ");
            }
            for (int cols = 0; cols< n-rows; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
