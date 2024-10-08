package Assignment_3;

import java.util.Scanner;

public class SumUntil0IsEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers(0 to end): ");
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0){
            sum+=a;
            a= sc.nextInt();
        }
        System.out.print("Sum is : "+sum);
    }
}
