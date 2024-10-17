package LC;

import java.util.Scanner;
//You are given an integer num. You can swap two digits at most once to get the maximum valued number.
//Return the maximum valued number you can get.
//Example 1: Input: num = 2736
//Output: 7236
//Explanation: Swap the number 2 and the number 7.
//Example 2:
//Input: num = 9973
//Output: 9973
//Explanation: No swap.

public class MaxSwap {
    public static int maximumSwap(int num) {
        char[] list = Integer.toString(num).toCharArray();
        int n = list.length;
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[list[i] - '0'] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int d = 9; d > list[i] - '0'; d--) {
                if (last[d] > i) {
                    char temp = list[i];
                    list[i] = list[last[d]];
                    list[last[d]] = temp;
                    return Integer.parseInt(new String(list));
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        MaxSwap obj = new MaxSwap();
        System.out.print(obj.maximumSwap(num));

    }
}
