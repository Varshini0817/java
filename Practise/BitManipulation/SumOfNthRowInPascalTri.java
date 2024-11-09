package Practise.BitManipulation;

public class SumOfNthRowInPascalTri {
    public static void main(String[] args) {
        int n = 5;
        //   1           1                  1                                   1
        //   2         1   1                2
        //   3       1   2   1              4
        //   4     1   3   3   1            8
        //   5   1   4   6   4   1          16

        //System.out.println((int)(Math.pow(2,n-1)));
        System.out.println(1<<(n-1));
    }
}
