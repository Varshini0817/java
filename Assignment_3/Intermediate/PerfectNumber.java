package Assignment_3.Intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        //Perfect number : sum of all factors of that num = number
        //from 1 to 1000 : 6 28 496
        int sum = 0;
        for(int i =1; i<num; i++){
            if(num%i == 0){
                sum+=i;
            }
        }
        if(sum == num){
            System.out.print("Perfect number");
        }
        else {
            System.out.print("Not a perfect number");
        }
    }
}
