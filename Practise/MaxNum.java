package Practise;

import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = Math.max(c,Math.max(a,b));
        int ans = a > b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.print("The max number is "+res +" " +ans);

    }
}
