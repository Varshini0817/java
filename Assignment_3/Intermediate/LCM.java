package Assignment_3.Intermediate;

import java.util.Scanner;

public class LCM {
    public static int findHCF(int a, int  b){
        int temp;
        while(a!=0){
            temp = a;
             a = b%a;
             b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num1 = Math.min(a,b);
        int num2 = Math.max(a,b);
        int HCF = findHCF(num1, num2);
        int i =1;
        if(a==0 || b==0)
        {
            System.out.println("LCM of "+a+" "+b+" "+"is: 0");
            return;
        }
        System.out.println("LCM of "+a+" "+b+" "+"is: ");
        //Approach : we select the least number between the two and get the multiples one by one by checking if it is divided by the other number.
        // if it is so, we obtain our LCM
        while(num1 * i % num2 != 0 ){
            i++;
        }
        System.out.println("Method 1: "+num1*i);

        //LCM Method 2:
        // Step 1 : Find HCF
        // Step 2 : (a*b) / HCF => LCM
        System.out.println("Method 2: "+(a*b)/HCF);

    }
}
