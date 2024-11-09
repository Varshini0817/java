package Practise.BitManipulation;

public class NoOfDigitsWithBase {
    public static void main(String[] args) {
        int num = 10;
        int base = 2;
        // log 10 base 2 = 3.32
        // 10 = 2^3.32 ~ 4
        //(int) log n base b + 1 digits
        System.out.println((int)(Math.log(num)/Math.log(base)+1));
    }
}
