package Practise;

import java.util.*;
public class CountOfAParticularDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a digit for count: ");
        int d = sc.nextInt();
        int temp = num,cnt=0;
        while(num>0){
            int n = num%10;
            num/=10;
            if(n==d) cnt++;
        }
        System.out.print("The count of "+d+" in "+temp+" is: "+cnt);

    }
}
