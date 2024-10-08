package Assignment_3;
import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of the rectangle(cm): ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        //Perimeter of the rectangle is 2(l+b)
        System.out.print("The perimeter of the rectangle is "+ 2*(l+b)+" cms");
    }
}
