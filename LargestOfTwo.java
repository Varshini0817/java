import java.util.*;

public class LargestOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a>b ? a:b;
        System.out.print(res +" "+ Math.max(a,b));
    }
}
