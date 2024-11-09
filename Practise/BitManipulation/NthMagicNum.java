package Practise.BitManipulation;

public class NthMagicNum {
    //nth magic number is given by
    //    5^3  5^2 5^1
    // 1   0    0   0   5
    // 2   0    0   1   25
    // 3   0    1   1   30
    // 4   1    0   0   125
    // 5   1    0   1   130
    public static void main(String[] args) {
        int n = 2;
        System.out.println(magicNum(n));
    }

    private static int magicNum(int n) {
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n&1; // to get last digit
            n=n>>1; // discard the last digit
            ans +=last*base; // adding answer
            base*=5; // making it 5^x
        }
        return ans;
    }

}
