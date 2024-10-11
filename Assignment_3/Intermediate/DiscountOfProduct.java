package Assignment_3.Intermediate;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price: ");
        float price = sc.nextFloat();
        System.out.print("Enter discount(%): ");
        float discount = sc.nextFloat();
        //Discount = price * discount(%) -->  discount price = addprice - discount
        double dp = ( 1-(discount/100) )*price;
        System.out.print("The discount price is: "+dp);

    }
}
