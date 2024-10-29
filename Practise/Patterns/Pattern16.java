package Practise.Patterns;
//Pascal Triangle
public class Pattern16 {

    // rows                          spaces  (3 spaces between 2 nums)   numbers
    //   1           1                  8                                   1
    //   2         1   1                6
    //   3       1   2   1              4
    //   4     1   3   3   1            2
    //   5   1   4   6   4   1          0
    public static void main(String[] args) {
        pattern16(5);
    }
    public static void pattern16(int n){
        for (int row = 0; row < n; row++) {
            // Print leading spaces
            for (int space = 0; space < (n - row - 1) * 2; space++) { // Adjusted to reduce by 2 each row
                System.out.print(" ");
            }

            int number = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(number + "   "); // Print number with consistent spacing
                number = number * (row - col) / (col + 1); // Calculate the next number in the row
            }
            System.out.println();
        }
    }
}
