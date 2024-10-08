package Assignment_3;
import java.util.*;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tSphere");
        System.out.print("Enter radius(cm): ");
        float r = sc.nextFloat();
        //Volume of Sphere = (4/3)*3.14*r*r*r
        double vol = ((double) 4 /3)*3.14*r*r*r;
        System.out.print("Volume of Sphere is "+ +vol+" cu.cm");
    }
}
