package Practise;

import java.util.Scanner;

public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            System.out.println("Reshaping is not possible, returning the original matrix.");
            return mat;
        }

        int[][] arr = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            arr[i / c][i % c] = mat[i / n][i % n];
        }

        return arr;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the original matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns in the original matrix: ");
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter the elements of the original matrix row by row:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of rows for the reshaped matrix: ");
        int r = scanner.nextInt();
        System.out.print("Enter the number of columns for the reshaped matrix: ");
        int c = scanner.nextInt();

        System.out.println("Original Matrix:");
        printMatrix(mat);

        ReshapeMatrix rm = new ReshapeMatrix();

        int[][] reshapedMatrix = rm.matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");
        printMatrix(reshapedMatrix);
    }
}
