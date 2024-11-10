package Practise.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print(sumDig(185412));
    }
    public static int sumDig(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumDig(n/10);
    }
}
