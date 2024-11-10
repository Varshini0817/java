package Practise.Recursion;

public class UptoN {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        System.out.print(n+" ");
        if( n== 1){
            return;
        }
        fun(n-1); // no need to return as the function return type is void
    }
}
