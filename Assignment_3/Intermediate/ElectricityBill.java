package Assignment_3.Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power consumed(units): ");
        int n = sc.nextInt();
        int res;
        if(n<=100){
            res = n*10;
        }
        else if(n<=200){
           res = (100*10) +(n-100)*15;

        }
        else if(n<=300){
            res = 100*10 + 100*15 + (n-200)*20;
        }
        else  {
            res = 100 * 10 + 100 * 15 + 100 * 20 + (n-300)*25;
        }
        System.out.print("Your bill is "+res);
    }
}
