package Assignment_3;

import java.util.Scanner;

public class MaxNumUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers(0 to end): ");
        int a = sc.nextInt();
        int max = a;
        while(a!=0){
            if(max<a){
                max=a;
            }
            a= sc.nextInt();
        }
        System.out.print("Max. num is : "+max);
    }
}
