package Practise.BitManipulation;

public class FindithBit {
    public static void main(String[] args) {
        int num = 46;
        System.out.println(Integer.toBinaryString(num));
        int i=4;
        System.out.println(findithBit(num,i));
    }

    private static int findithBit(int n,int i) {
        // W.K.T. num & 1 = num
        // eg 10101 --> num (i=5)
        // &  10000 --> mask (we get it by 1 << (i-1) (to add zero))
        // =  10000
        // next right shift again with (i-1) zeros to get the value
        int ans = n & (1 << (i-1));
        return ans >> (i-1);
    }
}
