package Practise;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static boolean matEqual(int[][] matrix1, int[][] matrix2){
        for(int i=0;i<matrix1.length;i++){
            if(!Arrays.equals(matrix1[i],matrix2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void rotate90Mat(int[][] mat){
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=i; j < n ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    }

    public static  boolean findR(int[][] matrix, int[][] target){
        for(int k=0; k<4; k++){
            if (matEqual(matrix, target)) {
                return  true;
            }
            rotate90Mat(matrix);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions(nxn): ");
        int n = sc.nextInt();
        int[][] m1 = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i=0 ; i<n; i++){
            for (int j=0; j<n; j++){
                m1[i][j] = sc.nextInt();
            }
        }

        int[][] target1 = new int[n][n];
        System.out.println("Enter elements of the target matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target1[i][j] = sc.nextInt();
            }
        }
        Solution sl = new Solution();
        boolean res = sl.findR(m1,target1);
        System.out.print(res);
    }
}
