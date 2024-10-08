package Assignment_3;
import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();

        double area = 3.14 * r *r;
        System.out.print("The area of the circle with radius " + r +" is: "+area);
    }
}
