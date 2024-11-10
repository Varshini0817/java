package Practise.Recursion;

public class SumUptoN {
    public static void main(String[] args) {
        System.out.print(sumN(5));
    }
    private static int sumN(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return n+sumN(n-1);
        }
    }

}
