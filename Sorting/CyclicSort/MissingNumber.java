package Sorting.CyclicSort;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            while (arr[i] != arr[arr[i]] - 1 ) {
                swap(arr, i, arr[i] - 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                return arr[i];
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second] ;
        arr[second]= temp;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.print(missingNumber(arr));
    }
}
