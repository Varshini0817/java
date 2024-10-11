package Assignment_3.Intermediate;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers(0 for exit): ");
        float n = sc.nextFloat();
        float pesum = 0, nsum = 0, posum = 0;
        //Calculating sum for negative numbers , positive even numbers, positive odd numbers
        while(n!=0){
            if(n<0){
                nsum +=n;
            }
            else{
                if(n%2 == 0)
                {
                    pesum+=n;
                }
                else {
                    posum+=n;
                }
            }
            n = sc.nextFloat();
        }
        System.out.print("Negative sum : "+nsum+"\nPositive even sum: "+pesum+"\nPositive odd number: "+posum);
    }
}
