package Practise.Patterns;

public class Pattern4 {
    //    1
    //    1 2
    //    1 2 3
    //    1 2 3 4
    //    1 2 3 4 5
    public static void main(String[] args) {
        pattern4(5);
    }
    public static void pattern4(int n){
        for(int rows = 1; rows<=n; rows++){
            for(int cols = 1; cols<= rows; cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
}
