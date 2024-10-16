package Practise;

import java.util.*;
import java.util.Collections;

public class AddToArrayForm {
    //The array-form of an integer num is an array representing its digits in left to right order.
    //For example, for num = 1321, the array form is [1,3,2,1].
    //Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
    //Input: num = [1,2,0,0], k = 34
    //Output: [1,2,3,4]
    //Explanation: 1200 + 34 = 1234

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int n = num.length;
        int i = n-1, carry = 0;
        while(i>=0 || k>0 || carry>0){
            int digit = (i>=0)?num[i] : 0;
            int kDigit = k%10;
            int sum = digit + kDigit + carry;
            carry = sum/10;
            res.add(sum%10);
            k/=10;
            i--;
        }
        Collections.reverse(res);
        return  res;
    }

    public static void main(String[] args) {
        AddToArrayForm obj = new AddToArrayForm();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        int num;
        for(int i=0; i<n; i++){
            num = sc.nextInt();
            arr[i]= num;
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        List<Integer> result = obj.addToArrayForm(arr, k);
        System.out.println("Resultant Array Form: " + result);
    }
}
