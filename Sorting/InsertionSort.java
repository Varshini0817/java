package Sorting;

import java.util.Arrays;

public class InsertionSort {
    // Sorting up to index 1, 2 ... n in each pass
    //Eg : 0 i runs till n-2 times as j = i+1 to prevent ArrayOutOfIndexException
    // j=(i+1) 1 --> checks if previous element > jth element ? swap : break
    public static void insertion(int[] arr){
        for(int i =0; i< arr.length-1; i++){
            for(int j= i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-34, -45, -24, 45, 0, 234};
        insertion(arr);
        System.out.print(Arrays.toString(arr));
    }
}
