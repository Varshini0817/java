package Practise.Patterns;

public class Pattern20 {
    //rows          stars spaces (n-3)
    //  1    ****     4     0
    //  2    *  *     2     2
    //  3    *  *     2     2
    //  4    *  *     2     2
    //  5    ****     4     0
    public static void main(String[] args) {
        pattern20(5);
    }
    public static void pattern20(int n){
        for(int rows= 1; rows<=n; rows++){
            if(rows == 1 || rows == n){
                for(int stars= 0; stars<n-1; stars++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");//left star
                for(int cols=0; cols<n-3; cols++){
                    System.out.print(" ");//middle spaces
                }
                System.out.print("*");//right star
            }
            System.out.println();
        }
    }
}
