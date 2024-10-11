package Assignment_3.Intermediate;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("HCF of "+a+" "+b+" is: ");
        //if(a>b) a=b;
        int temp;
        /*                     b%a
            a = 33, b = 43      a    b   temp
            temp = 33           33  43    -
            a = 33%43 = 10      10  33    33
            b = 33(temp)        3   10    10
            a = 33%10 = 3       1   3     3
            temp = 3            0   3     1
            b = 10(temp)        terminate on a == 0 and print b (temp value stored to b)
            a = 10%3 = 1
            b = 3
            a = 3%1 = 0
            b = 1
         */
        while(a!=0){
            temp = a;
            a = b%a;
            b = temp;
        }
        System.out.print(b);
    }
}
