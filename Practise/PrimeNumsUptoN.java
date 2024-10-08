package Practise;

import java.util.*;

public class PrimeNumsUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num == 1)
        {
            System.out.print("No primes");
        }
        else if(num==2)
        {
            System.out.print("Only one prime - 2");
        }
        else{
            System.out.print("The prime numbers till "+num+ ": 2 ");
            for(int j= 3; j<=num; j++) {
                boolean flag = true;
                int i = 2;
                while (i * i <= j) {
                    if (j % i == 0){
                        flag= false;
                        break;
                    }
                    i++;
                }
                if(flag)
                {
                    System.out.print(j+ " ");
                }
            }
        }
    }
}
