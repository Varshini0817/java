package Practise.BitManipulation;

public class CheckPowerOf2 {
    public static void main(String[] args) {
        int n = 1;
        // edge case == 0 not a power of 2
        // n & (n-1) == 0
        // 10000 n
        // 11111
        // 0 --> n is power of 2
        System.out.println( n!=0 && (n&(n-1))==0);
    }
}
