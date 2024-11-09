package Practise.BitManipulation;

public class NoOfSetBits {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(noOfSetBits(num));
    }

    private static int noOfSetBits(int n) {
        int cnt = 0;
//        while(n>0){
//            cnt++;
//            n-=(n&(-n));
//        }
        while(n>0){
            cnt++;
            n = n &(n-1);
        }
        return cnt;
    }
}
