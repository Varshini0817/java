package Assignment_3.Intermediate;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n =sc.nextInt();
        double avg=0;
        for(int i=0; i<n; i++)
        {
            float num = sc.nextFloat();
            avg+=num;
        }
        System.out.print("The average is "+avg/n);

    }
}
