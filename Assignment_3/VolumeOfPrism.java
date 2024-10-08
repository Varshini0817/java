package Assignment_3;
import java.util.*;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tPrism");
        System.out.print("Enter base area(sq.cm): ");
        float b = sc.nextFloat();
        System.out.print("Enter height(cm): ");
        float h = sc.nextFloat();
        System.out.print("Volume of prism is "+b*h+" cu.cm");
    }
}
