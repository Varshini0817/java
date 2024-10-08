package Assignment_3;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of cube(cm): ");
        float s = sc.nextFloat();
        //TSA of cube is 6*side*side
        System.out.print("The total surface area of cube is "+6*s*s+" sq.cm");
    }
}
