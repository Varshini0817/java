package Practise.Patterns;

public class Pattern32 {
    //  rows
    //   1    E
    //   2    D E
    //   3    C D E
    //   4    B C D E
    //   5    A B C D E
    public static void main(String[] args) {
        pattern32(5);
    }
    public static void pattern32(int n){
        for (int rows=1; rows<=n; rows++){
            for (int cols = rows; cols>=1; cols--){
                System.out.print( (char)('A'+ (n-cols)) +" ");
            }
            System.out.println();
        }
    }
}
