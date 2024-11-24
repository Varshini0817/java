package Practise.Recursion;
public class BinarySearch {
    //Binary search using recursion
    // pass the elements start, end as arguments that decide the size of the array to search
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,67,88,90};
        int target = 10;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    public static int search(int[] arr, int target, int start, int end){
        int mid = start + (end - start)/2;
        if(start > end)
        {
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return search(arr, target, mid+1, end );
        }
        else {
            return search(arr, target, start, mid-1);
        }
    }
}
