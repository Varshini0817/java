package Practise.BitManipulation;

public class XORFrom0toN {
    public static void main(String[] args) {
        int num = 9;
        for(int i=0; i<=10; i++) {
            System.out.println(xor(i)+" "+i);
        }
    }

    private static int xor(int num) {
        if( num % 4 == 0) return num;
        else if( num % 4 == 1 ) return 1;
        else if( num % 4 == 2) return num+1;
        else return 0;
    }
}
