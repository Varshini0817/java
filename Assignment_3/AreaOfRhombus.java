package Assignment_3;
import java.util.*;

public class AreaOfRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal 1: ");
        float d1 = sc.nextFloat();
        System.out.print("Enter diagonal 1: ");
        float d2 = sc.nextFloat();

        System.out.println("Area of the rhombus is: "+ 0.5*d1*d2);
    }
}
