package Assignment_3;
import java.util.*;

public class AreaOfIsosceles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter base: "));
        float b = sc.nextFloat();
        System.out.print(("Enter height: "));
        float h = sc.nextFloat();
        //Area of an isosceles triangle = 1/2 * b * h
        System.out.print("Area of the isosceles triangle is : "+ 0.5*b*h);
    }
}
