package Practise.BitManipulation;

public class OddEvenFunc {
    public static void main(String[] args) {
        int num = 49;
        //num = 48; false
        System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num) {
        return (num&1) == 1;
    }


}
