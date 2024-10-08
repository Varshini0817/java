package Assignment_3;
import java.util.*;

public class PerimeterOfSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square(cm): ");
        float s = sc.nextFloat();
        //Perimeter of square is 4*side
        System.out.print("The perimeter of square is "+ 4*s+" cm" );
    }
}
