package Practise.Recursion.Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //int[] arr = {4,2,8,3,0,9,1};
        //int[] arr = {1,2,3,4,98};
        int[] arr = {4,3,2,1};
        selection(arr,arr.length-1,0,0);
        System.out.print(Arrays.toString(arr));
    }
    public static void selection(int[] arr, int r, int c,int max){
        if(r==0){
            return;
        }
        if(c<=r){ // note this traversing till the last element to find out the highest
            if(arr[c] > arr[max]){
                selection(arr,r,c+1,c);
            }
            else {
                selection(arr,r,c+1,max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
}
