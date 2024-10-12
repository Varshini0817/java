package Practise;

import java.util.*;
public class Array2DInitialization {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9},
                {0, 9, 3, 2}
        };

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}