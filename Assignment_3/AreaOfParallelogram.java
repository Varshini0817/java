package Assignment_3;
import java.util.*;

public class AreaOfParallelogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        float b = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();
        //Area of  parallelogram is base * height
        System.out.print("Area of the parallelogram is : "+b* h);
    }
}