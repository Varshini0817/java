package Practise.Patterns;

public class Pattern26 {
    //rows                  count
    // 1     1 1 1 1 1 1     6
    // 2     2 2 2 2 2       5
    // 3     3 3 3 3         4
    // 4     4 4 4           3
    // 5     5 5             2
    // 6     6               1
    public static void main(String[] args) {
        pattern26(6);
    }
    public static void pattern26(int n){
        for(int rows = 1; rows<=n; rows++){
            for(int cols= 0; cols<n-rows+1; cols++){
                System.out.print(rows+" ");
            }
            System.out.println();
        }
    }
}
