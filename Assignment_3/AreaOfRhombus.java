package Assignment_3;
import java.util.*;

public class AreaOfRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tRhombus ");
        System.out.print("Enter diagonal 1(cm): ");
        float d1 = sc.nextFloat();
        System.out.print("Enter diagonal 1(cm): ");
        float d2 = sc.nextFloat();
        //Area of the rhombus = 1/2 * diagonal1 * diagonal2
        System.out.println("Area of the rhombus is: "+ 0.5*d1*d2+" sq.cm");
    }
}
