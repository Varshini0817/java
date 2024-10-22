package BinarySearch;

import java.util.Arrays;

public class RowColMatrix2D {
    static int[] search2D(int[][] mat, int target){
        int row = 0, col = mat[0].length-1;
        while(row < mat.length && col>=0){
            if(mat[row][col] == target){
                return new int[]{row,col};
            }
            else if(mat[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] mat= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
                {39, 40, 42, 55}
        };
        int target = 42;
        int[] res = search2D(mat, target);
        System.out.println(res[0]+" "+res[1]);
        System.out.print(Arrays.toString(search2D(mat,target)));

    }
}
