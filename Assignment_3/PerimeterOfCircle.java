package Assignment_3;
import java.util.*;

public class PerimeterOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        float r = sc.nextFloat();
        // Perimeter of a circle = 2*pi*r
        System.out.print("Perimeter of a circle:"+ 2 * 3.14 * r);
    }
}
