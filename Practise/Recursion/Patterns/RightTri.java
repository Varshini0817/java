package Practise.Recursion.Patterns;
public class RightTri {
    public static void main(String[] args) {
        pattern(4,0);
    }
    public static void pattern( int r, int c){
        if(r == 0){ //base condition
            return;
        }
        if(c<r){
            pattern(r,c+1);
            System.out.print("*");
        }
        else {
            pattern(r-1,0);
            System.out.println();
        }
    }
}
