package Assignment_3.Intermediate;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value, rate of interest, time period: ");
        float pv = sc.nextFloat();
        float r  = sc.nextFloat();
        float t = sc.nextFloat();

        double fv = pv * Math.pow((1+r/100),t);
        System.out.print("Future investment value: "+fv);
    }
}
