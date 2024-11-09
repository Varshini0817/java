package Practise.Math;

public class Prime {
    public static void main(String[] args) {
        int num = 37;
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
