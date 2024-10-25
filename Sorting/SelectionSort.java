package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-89,-45,-98,-45,87,89,34,345};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex, last );
        }
    }
    public static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
