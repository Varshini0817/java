package Assignment_3;
import java.util.*;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tCylinder");
        System.out.print("Enter radius(cm): ");
        float r = sc.nextFloat();
        System.out.print("Enter height(cm): ");
        float h = sc.nextFloat();
        //Volume of cylinder is pi*r*r*h
        System.out.print("The volume of the cylinder is "+ 3.14*r*r*h);
    }
}
