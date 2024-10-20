package BinarySearch;

public class Mountain {
    static int mountain(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr, target, 0 , peak);
        if(firstTry != -1) {
            return firstTry; // if found in the asc part of the array
        }
        return  orderAgnostic(arr, target, peak+1, arr.length-1);//checking in the descending part of the array

    }
    static int orderAgnostic(int[] arr, int target , int start, int end){
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
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }//start and end point to the same index which is the peak in the mountain array
        return start;
    }
    public static void main(String[] args) {
        Mountain obj = new Mountain();
        int[] arr = { 0,1,2,3,5,6,7,4,3,2,1};
        int target = 4;
        System.out.print(obj.mountain(arr, target));
    }
}
