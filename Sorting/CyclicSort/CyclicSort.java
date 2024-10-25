package Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    //Cyclic sort works on 1-N or 0-N by placing the values correctly at index-1 or index positions
    // by just swapping them until the condition is satisfied
    public static void cyclic(int[] arr){
        for(int i=0; i< arr.length;i++){
            while(arr[i] != arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }
        }
    }
    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,7,8,9,10,6};
        cyclic(arr);
        System.out.print(Arrays.toString(arr));
    }
}
