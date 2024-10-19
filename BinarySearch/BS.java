package BinarySearch;

import java.util.Scanner;

public class BS {
    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if (arr[mid]< target){
                start = mid + 1;
            }
            else{
                return mid;// returns index
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size: ");
//        int n = sc.nextInt();
//        System.out.print("Enter a sorted array: ");
//        int[]  arr = new int[n];
//        for(int i = 0; i<n; i++){
//            int num = sc.nextInt();
//            arr[i]=num;
//        }
//        System.out.print("Enter target: ");
//        int target = sc.nextInt();
        int[] arr ={24,35,67,89,101,123};
        int target = 78;
        System.out.print("Index is: "+binarySearch(arr, target));
    }
}
