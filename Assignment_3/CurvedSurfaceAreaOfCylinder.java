package Assignment_3;
import java.util.*;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tCylinder");
        System.out.print("Enter radius(cm): ");
        float r = sc.nextFloat();
        System.out.print("Enter height(cm): ");
        float h = sc.nextFloat();
        double CSA = 2*3.14*r*h;
        System.out.print("Curved Surface Area of cylinder is "+CSA+" sq.cm");
    }
}
