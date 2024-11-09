package Practise.BitManipulation;

public class RightMostSetBit {
    public static void main(String[] args) {
        int num = 112;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(rightMostSetBit(num));
    }
    private static int rightMostSetBit(int num) {
        int ans = num & (-num); // gives you the right most set bit
        int cnt = 1;
        while((ans&1) !=1){
            cnt++;// to get the position
            //System.out.println(Integer.toBinaryString(ans));
            ans= ans>>1;
        }
        return cnt;
    }

}
