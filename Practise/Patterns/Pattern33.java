package Practise.Patterns;

public class Pattern33 {
    // alternating lower case & upper case
    // rows
    //  1     a
    //  2     B c
    //  3     D e F
    //  4     g H i J
    //  5     k L m N o
    public static void main(String[] args) {
        pattern33(5);
    }
    public static void pattern33(int n){
        char ltr ='a';
        boolean lcase = true;
        for (int rows = 1; rows<=n ;rows++){
            for (int cols = 1; cols<=rows; cols++){
                if (lcase){
                    System.out.print(Character.toLowerCase(ltr)+" ");
                    lcase = false;
                }else {
                    System.out.print(Character.toUpperCase(ltr)+" ");
                    lcase= true;
                }
                ltr++;
            }
            System.out.println();
        }
    }
}
