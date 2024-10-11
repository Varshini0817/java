package Assignment_3.Intermediate;

import java.util.Scanner;

public class PermutationCombination {
    public static long factorial(int n){
        long res = 1;
        for(int i = 1; i<=n; i++) {
            res  *=  i;
        }
        //System.out.println(n+" "+res);
        return  res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        if(n < r){
            System.out.print("Invalid");
        }
        else {
            // n C r = n!/((r!(n-r)!)
            // n P r = n! / (n-r)!
            long p = factorial(n) / factorial(n - r);
            System.out.println("Permutation " + n + "P" + r + " :" + p);

            long c = factorial(n) / ((factorial(r) * factorial(n - r)));
            System.out.print("Combination " + n + "C" + r + " :" + c);
        }
    }
}
