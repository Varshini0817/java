package Practise.Recursion;

public class Palindrome {
    //method 1
    public static int rev(int n){
        int digits = (int)(Math.log10(n))+1;// no. of digits
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){// single digit - base case
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1))+(helper(n/10, digits-1));
    }
    public static boolean isPalin(int n){
        return n==rev(n);
    }
    public static void main(String[] args) {
        System.out.print(isPalin(124321));
    }
}
