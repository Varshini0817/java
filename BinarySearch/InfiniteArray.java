package BinarySearch;

public class InfiniteArray {
    //if an array is infinite, check for the target in the array
    public static int ans(int[] nums, int target){
        int start = 0 , end = 1;
        while(true){
            try{
                if(target <= nums[end]) {
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                break;
            }

//        while(target > nums[end] ){
            int temp = end + 1;// to update the start with previous end + 1
            end = end + (end - start + 1)*2; //increasing exponentially 2,4,8...
            start = temp;
        }
        //System.out.println(start+" "+end);
        return binarySearch(nums , target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end) {
            int mid = start + (end - start) / 2;
            try {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;// returns index
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 25, 26, 27, 30, 40, 50, 60, 80, 90, 100};
        int target = 100;
        System.out.print(ans(arr, target));
    }
}
