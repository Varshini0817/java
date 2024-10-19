package BinarySearch;

public class OrderAgnosticBS {
    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        boolean isAsc = arr[start]< arr[end] ;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target) return mid;
            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(arr[mid] > target){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] asc ={24,35,67,89,101,123};
        int[] desc = {123, 101,89,67,35,24};
        int target = 67;
        System.out.print("Index is: "+binarySearch(desc, target));
    }
}
