package Practise.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.print(prodDig(8500));
    }
    public static int prodDig(int n){
        if(n==0){
            return 1;
        }
        return (n%10) * prodDig(n/10);
    }
}
