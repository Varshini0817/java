package Sorting.CyclicSort.LC;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        //System.out.print(Arrays.toString(arr));
        for (i=0; i<arr.length; i++){
            if(arr[i]!=i){
                return i;
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
