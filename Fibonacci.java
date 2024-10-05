import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1,count = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("The series is : "+a+" "+b+" ");
        while(count<num){
            int temp = b;
            b=a+b;
            a = temp;
            count++;
            System.out.print(b+" ");
        }
        //System.out.println("The fibonacci series is : "+b);
    }
}
