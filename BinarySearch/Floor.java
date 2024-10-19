package BinarySearch;

public class Floor {
    //ceiling in a bs  refers to the greatest number in the array that is <= target
    static int floor(int[] arr, int target){
        int start = 0, end = arr.length-1;
        if(target<arr[start]) return -1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if (arr[mid]< target){
                start = mid + 1;
            }
            else{
                return arr[mid];// returns index
            }
           // System.out.println(start+" "+end+" "+mid+" ");
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target = 4;
        System.out.print("Number is: "+ floor(arr, target));
    }
}
