package Practise.Math;

public class GCD {
    //Euclid's algorithm
    public static void main(String[] args) {
        System.out.println(gcd(4,9));
    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
