import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i=0,j= str.length()-1;
        while(i<=j)
        {
            boolean res = str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j);
            if(!res){
                System.out.print("The string isn't a palindrome!");
                return;
            }
            i++;
            j--;
        }
        System.out.print("The string is a palindrome!");
    }
}
