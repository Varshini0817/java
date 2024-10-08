package Assignment_3;
import java.util.*;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tPyramid");
        System.out.print("Enter area(sq.cm): ");
        double a = sc.nextDouble();
        System.out.print("Enter height(cm): ");
        double h = sc.nextDouble();
        //Volume of Pyramid = (1/3)*area*height
        double vol = (( (double) 1 /3)*a*h );
        System.out.print("The volume of the pyramid is "+vol+" cu.cm");
    }
}
