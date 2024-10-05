import java.util.*;

public class IsPrime {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("1 is neither prime nor composite");
        }
        else if(num==2)
        {
            System.out.println("2 is a prime number");
        }
        else {
            int i=2;
            boolean flag = true;
            while(i*i <=num){
             if(num%i ==0 ){
                 flag = false;
                 break;
             }
             i++;
            }
            if(flag){
                System.out.print(num +" is a prime number");
            }
            else{
                System.out.print(num + " is a composite number");
            }
        }
    }
}
