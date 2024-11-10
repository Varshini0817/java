package Practise.Recursion;

public class FromN {
    public static void main(String[] args) {
        fromN(5);
    }
    public static void fromN(int n){
        if(n == 1 ){
            System.out.print(n+" ");
            return;
        }
        fromN(n-1);
        System.out.print(n+" ");
    }
}
