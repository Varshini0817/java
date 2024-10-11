package Assignment_3.Intermediate;

import java.util.Optional;
import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price : ");
        float p = sc.nextFloat();
        System.out.print("Enter commission: ");
        float c = sc.nextFloat();
        //Commission percentage is (commission/price) * 100
        System.out.print("Commission percentage is "+ (c/p)*100+" %");
    }
}
