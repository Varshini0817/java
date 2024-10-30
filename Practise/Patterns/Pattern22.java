package Practise.Patterns;

public class Pattern22 {
    // rows   0 1 2 3 4
    //  0     1
    //  1     0 1
    //  2     1 0 1
    //  3     0 1 0 1
    //  4     1 0 1 0 1
    public static void main(String[] args) {
        pattern22(5);
    }
    public static void pattern22(int n){
        int number=1;
        for(int rows = 0; rows<n; rows++){
            number = rows%2 == 0 ? 1: 0;
            for (int cols = 0; cols<=rows; cols++){
                System.out.print(number+" ");
                number = number == 0 ? 1 : 0;
            }
            //number = number == 0 ? 1 : 0;
            System.out.println();
        }
    }
}
