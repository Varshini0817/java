package Assignment_3.Intermediate;

import java.util.Scanner;

public class DistBtw2Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point a(x1,y1): ");
        float x1= sc.nextFloat();
        float y1 = sc.nextFloat();
        System.out.print("Enter point b(x2,y2): ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        //Distance between 2 points(x1,y1) & (x2,y2) is sq.rt((x2-x1)^2 + (y2-y1)^2))
        double dist = Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
        System.out.print("The distance between a and b is: "+dist);
    }
}
