package Practise.Patterns;

public class Pattern14 {
    //rows              stars       spaces
    // 0    *********     9         0
    // 1     *     *      2         1   5
    // 2      *   *       2         2   3
    // 3       * *        2         3   1
    // 4        *         1         4
    public static void main(String[] args) {
        pattern14(5);
    }
    public static void pattern14(int n){
        for(int rows=0; rows<n; rows++){
            for(int spaces = 0; spaces<rows; spaces++){
                System.out.print(" ");
            }
            if(rows==0){
                for(int stars=0; stars<2*n-1;stars++){
                    System.out.print("*");
                }
            }
            else if(rows==n-1){
                System.out.print("*");
            }
            else {
                System.out.print("*");//left star
                int innerSpaces = 2*(n-rows-1)-1; // 2*(5-1-1)-1=5; 2*(5-2-1)-1=3; 2*(5-3-1)-1=1
                for (int spaces=0; spaces<innerSpaces;spaces++){
                    System.out.print(" ");
                }
                System.out.print("*");//right star
            }
            System.out.println();
        }
    }
}
