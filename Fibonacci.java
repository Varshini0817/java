import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1,count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        while(count<=num){
            int temp = b;
            b=a+b;
            a = temp;
            count++;
        }
        System.out.println("The fibonacci series is : "+b);
    }
}
