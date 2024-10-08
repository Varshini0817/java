package Assignment_3;
import java.util.*;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle(cm): ");
        float side = sc.nextFloat();
        //Perimeter of equilateral triangle is 3a
        System.out.print("The perimeter of the equilateral triangle is : "+ 3*side+" cms");
    }
}
