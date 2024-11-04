package Practise.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    //for a little larger numbers say 50, the program doesn't terminate as there are many repeated function calls
    // and the space consumed is more, we can say recursion is inefficient in such cases

    // Time complexity of fibonacci is not 2^n but the golden ratio is 2^n

    public static int fibonacci(int n){
        // there should be a base condition to stop recursion otherwise it ends in an infinite loop
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
