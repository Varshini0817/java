package Assignment_3.Intermediate;

import java.util.Optional;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        float base = sc.nextFloat();
        System.out.print("Enter power: ");
        float pow = sc.nextFloat();
        //Value = base^power
        System.out.println("Value: " + Math.pow(base,pow));
        double res = 1;
        for(int i=1;i<=pow; i++)
        {
            res *=base;
        }
        System.out.print("Value: "+res);
    }
}
