package BinarySearch.BinarySearch2D;

import java.util.Arrays;

public class SortedMatrix {
    static int[] binarySearch(int[][] mat, int target,int row, int cStart, int cEnd){
        while(cStart<= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(mat[row][mid] == target){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<target){
                cStart = mid+1;
            }
            else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] mat, int target){
        int rows = mat.length;
        int cols = mat[0].length;
        if(cols==0) {
            return new int[]{-1,-1};
        }
        if(rows == 1){
            return binarySearch(mat, target, 0, 0, cols-1);
        }
        int rStart = 0, rEnd = rows-1;
        int cMid = cols/2;

        // leaving with 2 rows
        while(rStart< (rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;
            if(mat[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if (mat[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        //checking in 2 rows middle columns
        if(mat[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        else if(mat[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        //if not found , check in the remaining parts
        if(mat[rStart][cMid-1] >= target ){ // not checking with the first element in the row as it is the start, all the other rows are eliminated ,
                                            // if the target< mat[rStart][cMid-1] then it shd definitely be towards the left
            return binarySearch(mat, target, rStart, 0, cMid-1);
        }

        // check immediately the same row of the other side of the mid-column as it is next continuous array of elements
        else if (mat[rStart][cMid+1] <=target && mat[rStart][cols-1] >= target){
            return binarySearch(mat, target, rStart, cMid+1, cols-1);
        }
        // if any of the if-conditions are changed you can add additionally (target >= mat[rStart+1][0]) to the below one to check if it within that range
        else if (mat[rStart+1][cMid-1] >= target ){ // checking the 2nd row if the element is present to left side of the col
            return binarySearch(mat, target, rStart+1, 0,cMid-1);
        }
        else {
            return binarySearch(mat, target , rStart+1, cMid+1, cols-1);
        }
    }
    public static void main(String[] args) {
        int[][] mat1 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}

        };
        System.out.println("Matrix 1(3x5): ");
        for(int i=1; i<=15; i++){
            System.out.print(Arrays.toString(search(mat1, i)) +" ");
        }
        System.out.println();
        System.out.println("Matrix 2(rows 1): ");
        int[][] mat2 = {{1,2,3,4,5}};
        int target = 4;
        for(int i=1; i<=4; i++){
            System.out.print(Arrays.toString(search(mat2, i)) +" ");
        }
    }
}
