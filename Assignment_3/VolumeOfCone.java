package Assignment_3;
import java.util.*;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the base & height of the cone(cm):");
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        // Volume of cone is (1/3)*pi*r*r*h
        double vol = ((double) 1 /3)*3.14*r*r*h;
        System.out.print("The volume of the cone is "+vol+" cubic cm");
    }
}
