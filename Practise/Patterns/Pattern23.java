package Practise.Patterns;

public class Pattern23 {
    // rows                         spaces
    //  0         *      *            4   6
    //  1       *   *  *   *          2 3 2 3
    //  2     *      *      *         0 6 0 6

    public static void main(String[] args) {
        pattern23(3);
    }
    public static void pattern23(int n){
        for(int rows =0; rows< n; rows++){
            if(rows == 0) {
                System.out.print(" ".repeat(n-1)+" *"+" ".repeat((2 * (n - rows)) - 3)+"    *");//first spaces
            }
            else if(rows == n-1){
                System.out.print("*"+" ".repeat(2*rows-1)+"   *  "+" ".repeat(2*rows-1)+" * ");
            }
            else {
                System.out.print(" ".repeat(n-1-rows)+"* "+" ".repeat(2*rows-1)+" * ");
                System.out.print(" ".repeat((2 * (n - rows)) - 3)+" * "+" ".repeat(2*rows-1)+" * ");
            }
            System.out.println();
        }
    }
}
