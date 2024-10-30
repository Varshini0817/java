package Practise.Patterns;

import java.io.FilterOutputStream;

public class Pattern27 {
    // rows                             spaces
    //   1   1 2 3 4  17 18 19 20          0
    //   2     5 6 7  14 15 16             2
    //   3       8 9  12 13                4
    //   4         10 11                   6
    public static void main(String[] args) {
        pattern27(5);
    }

    public static void pattern27(int n) {
        int number = 1, rightNum = n * n + 1;
        int firstNum = rightNum;
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 0; spaces < 2 * (rows - 1); spaces++) {
                System.out.print(" ");
            }
            for (int print = 1; print <= n - rows + 1; print++) {
                System.out.print(number + " ");
                number++;
            }
            if(number<10) {
                System.out.print(" ");
            }
            if (rows == 1) {
                for (int print = 1; print <= n - rows + 1; print++) {
                    System.out.print(rightNum + " ");
                    rightNum++;
                }
            }
            else {
                int printNum = firstNum -(n -rows)-1;
                firstNum = printNum;
                for(int print = 1; print <= n - rows + 1; print++){
                    System.out.print(printNum+"  ");
                    printNum++;
                }
            }
            System.out.println();
        }
    }
}