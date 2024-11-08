package Practise.BitManipulation;

public class SetithBit {
    // setting ith bit --> 0 to 1 or 1 as 1
    //   num OR with (1 << i-1)-> mask
    public static void main(String[] args) {
        int num = 56;
        System.out.println(Integer.toBinaryString(num));
        int i = 2;
        //System.out.println( 1 | 1);
        System.out.println(setithBit(num, i));
        System.out.println(Integer.toBinaryString(setithBit(num, i)));
    }

    private static int setithBit(int num, int i) {
        int ans = num | 1  << (i-1);
        return ans;
    }

}
