package Practise.Recursion;

public class PostPreDecrement {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        System.out.print(n+" ");
        if(n==1){
            return;
        }
        //print(n--); --> infinite loop as n is sent first and then decrements , it sends 5 as an argument
        // so again 5 is sent and then decremented , there's no change in n
        print(--n);
    }
}
