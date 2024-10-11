package Assignment_3.Intermediate;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value , rate , time: ");
        float v = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        //Depreciation = v(1-r/100)^t
        double dep = v*Math.pow((1- (r/100)),t);
        System.out.print("Depreciation value is : "+dep);
    }
}
