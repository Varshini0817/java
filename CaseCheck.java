import java.util.*;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  word = sc.next();

        if(word.charAt(0) >= 'a' &&  word.charAt(0) <='z' ){
            System.out.print("Lower case");
        }
        else if(word.charAt(0) >= 'A' && word.charAt(0) <='Z' ){
            System.out.print("Capital case");
        }
    }
}
