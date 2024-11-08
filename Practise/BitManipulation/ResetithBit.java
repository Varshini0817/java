package Practise.BitManipulation;

public class ResetithBit {
    // reset ith bit --> 0 as 0 , 1 to 0
    // num & ~( 1<< i-1) [complement]
    public static void main(String[] args) {
        int num = 98;
        System.out.println(Integer.toBinaryString(num));
        int i = 6;
        System.out.println(resetithBit(num, i));
        System.out.println(Integer.toBinaryString(resetithBit(num,i)));
    }

    private static int resetithBit(int num, int i) {
        return num & ~( 1 << (i-1));
    }

}
