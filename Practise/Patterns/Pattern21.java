package Practise.Patterns;

public class Pattern21 {
    //  rows
    //    1   1
    //    2   2  3
    //    3   4  5  6
    //    4   7  8  9  10
    //    5   11 12 13 14 15
    public static void main(String[] args) {
        pattern21(5);
    }
    public static void pattern21(int n){
        int number = 1;
        for(int rows=1; rows<=n; rows++){
            for(int cols = 1; cols<=rows; cols++){
                int spaces = number<10 ? 2: 1;
                System.out.print(number+" ".repeat(spaces));
                number++;
            }
            System.out.println();
        }
    }
}
