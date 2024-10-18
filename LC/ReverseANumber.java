package LC;

import java.util.Scanner;
//Given a signed 32-bit integer x, return x with its digits reversed.
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
public class ReverseANumber {
        public static int reverse(int x) {
            int rev = 0, d;
            int temp = x;
            if (x < 0) {
                x = x * -1;
            }

            while (x > 0) {
                d = x % 10;
                //The largest 32-bit signed integer is 2147483647.
                //If the partially reversed number (result) reaches 214748364 and the next digit to be appended is greater than 7,
                // the final result will exceed 2147483647, causing an overflow.
                if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                    return 0; // Overflow for positive numbers
                }
                //the smallest 32-bit signed integer is -2147483648.
                // We need to ensure that, when result == -214748364, appending a digit less than -8 would result in an overflow.
                if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                    return 0; // Overflow for negative numbers
                }

                rev = rev * 10 + d;
                x /= 10;
            }
            if (temp < 0) {
                rev = rev * -1;
            }
            return rev;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        ReverseANumber obj = new ReverseANumber();
        System.out.print("The reverse of the number "+num+" is: "+obj.reverse(num));

    }
}
