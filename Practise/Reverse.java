package Practise;

import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int temp=num;
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }
        System.out.print("The reverse of the number "+temp+ " is "+ rev);
    }
}
