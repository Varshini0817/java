package Assignment_3;
import java.util.*;

public class PerimeterOfRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the rhombus:(cm) ");
        float s = sc.nextFloat();
        //Perimeter of rhombus is 4*side
        System.out.print("The perimeter of rhombus is "+ 4*s+" cm" );
    }
}
