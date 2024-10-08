package Assignment_3;
import java.util.*;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the triangle(cm): ");
        float a = sc.nextFloat();
        double area = (Math.sqrt(3)/4)*Math.pow(a,2);
        //Area of an equilateral triangle is (sqrt(3)/4)* a*a
        System.out.print("Area of an equilateral triangle is: "+area+" sq.cm");
    }
}
