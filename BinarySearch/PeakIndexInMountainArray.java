package BinarySearch;

public class PeakIndexInMountainArray {
//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
    public int peakIndexInMountainArray(int[] arr) {
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

//Example 1: Input: arr = [0,1,0]
//Output: 1
//Example 2: Input: arr = [0,2,1,0]
//Output: 1
//Example 3: Input: arr = [0,10,5,2]
//Output: 1
    public static void main(String[] args) {
        int[] arr = {0,10,12,34,56,89,90,45,5,2};
        PeakIndexInMountainArray obj = new PeakIndexInMountainArray();
        System.out.print(obj.peakIndexInMountainArray(arr));
    }
}
