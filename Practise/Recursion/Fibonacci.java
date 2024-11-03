package Practise.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n){
        // there should be a base condition to stop recursion otherwise it ends in an infinite loop
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
