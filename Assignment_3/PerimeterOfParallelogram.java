package Assignment_3;
import java.util.*;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter both sides  of the parallelogram: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        //Perimeter of parallelogram is 2(a+b)
        System.out.print("The perimeter of parallelogram is "+ 2*(a+b));
    }
}
