import java.util.*;
public class Calculator {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' ||op == '*' || op == '/' ||op == '%' ){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op =='+') ans = a+b;
                if(op =='-') ans = a-b;
                if(op =='*') ans = a*b;
                if(op =='/') {
                    if(b==0) {
                        System.out.println("Invalid operation");
                        continue;
                    }
                    else{
                        ans = a / b;
                    }
                }
                if(op =='%') ans = a%b;
                System.out.println(a + " " + op + " " + b + " = " + ans);
            }
            else if(op == 'x' || op=='X') {
                System.out.print("End");
                break;
            }
            else{
                System.out.println("Invalid operator\nEnter a valid one!");
            }
        }
    }
}
