package Practise.Patterns;

public class Pattern34 {
    // rows               n-rows to 1
    //   0    E D C B A   5-1
    //   1    D C B A     4-1
    //   2    C B A       3-1
    //   3    B A         2-1
    //   4    A           1-1
    public static void main(String[] args) {
        pattern34(5);
    }
    public static void pattern34(int n){
        for (int rows =0; rows<n; rows++){
            for (int cols = n-rows; cols > 0; cols--){
                System.out.print((char)('A'+cols-1)+" ");
            }
            System.out.println();
        }
    }
}
