package Practise.Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,8,4,9,2};
        sort(arr,0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int l, int h){
        if(l<=h){
            return;
        }
        int s= l, e=h;
        int m = s + (e-s)/2;
        int piv = arr[m];

        while(s<= e){
            while(arr[s] < piv){
                s++;
            }
            while (arr[e] > piv){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,l,e);
        sort(arr,s, h);
    }
}
