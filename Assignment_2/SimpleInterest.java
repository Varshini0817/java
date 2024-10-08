package Assignment_2;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        float p = sc.nextFloat();
        System.out.print("Enter time period: ");
        float t = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();
        float SI = (p*t*r)/100;
        System.out.println("Simple Interest: "+ SI);
    }
}
