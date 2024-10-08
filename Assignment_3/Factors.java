package Assignment_3;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Factors of "+n+" is: " );
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
//        for(int i=1; i<= Math.sqrt(n); i++){
//            if(n%i==0){
//                System.out.print(i+" ");
//                if(i != n/i){
//                    System.out.print((n/i)+ " ");
//                }
//            }
//        }
    }
}
