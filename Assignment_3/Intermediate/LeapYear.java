package Assignment_3.Intermediate;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year: ");
        int yr = sc.nextInt();
        // A year which is divisible by 400 or divisible  by 4 but not by 100
        if(yr % 400 == 0 || (yr % 100 !=0 && yr % 4==0)){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not a leap year");
        }
    }
}
