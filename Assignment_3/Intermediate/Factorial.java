package Assignment_3.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<= n; i++){
            factorial*=i;
        }
        System.out.print("The factorial of "+ n +" is "+factorial);
    }
}