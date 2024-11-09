package Practise.BitManipulation;

public class XORFrom0toN {
    public static void main(String[] args) {
        int a=3 , b=9;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }
    private static int xor(int num) {
        if( num % 4 == 0) return num;
        else if( num % 4 == 1 ) return 1;
        else if( num % 4 == 2) return num+1;
        else return 0;
    }
}
