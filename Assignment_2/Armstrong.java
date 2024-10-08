package Assignment_2;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  temp = num,a,cube=0;
        boolean res ;
        if(num<=9)
        {
            res = true;
        }
        else {
            while(num>0){
                a =num%10;
                cube += a*a*a;
                num/=10;
            }
            res = cube == temp;
        }
        if(res){
            System.out.println("It is an armstrong number");
        }
        else {
            System.out.println("It is not an armstrong number ");
        }
    }
}