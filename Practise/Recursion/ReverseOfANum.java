package Practise.Recursion;

public class ReverseOfANum {
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
        rev1(1234);
        System.out.print(sum);
    }


}
