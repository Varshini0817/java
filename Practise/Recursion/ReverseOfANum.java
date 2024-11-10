package Practise.Recursion;

public class ReverseOfANum {
    //method 1
    static int sum = 0;
    public static void rev1(int n){
        if(n==0){
            return;
        }
        int digit = n%10;
        sum = sum*10+digit;
        rev1(n/10);
    }
    public static void main(String[] args) {
        int n = 124648024;
        rev1(n);
        System.out.println(sum);
        System.out.println(rev2(n));
    }
    //method 2
    public static int rev2(int n){
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

}
