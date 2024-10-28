package Practise.Patterns;

public class Pattern1 {
    //    *****
    //    *****
    //    *****
    //    *****
    //    *****
    public static void main(String[] args) {
        pattern1(5);
    }
    public static void pattern1(int n){
        for(int rows=0; rows<n; rows++){
            for(int cols=0; cols<n; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
