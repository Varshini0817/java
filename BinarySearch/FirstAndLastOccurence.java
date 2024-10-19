package BinarySearch;

public class FirstAndLastOccurence {
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }
    public static  int search(int[] nums, int target, boolean startIndex) {
        int ans = -1;
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid]< target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(startIndex){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={5,6,7,7,7,7,7,7,8,8,8,9};
        int target = 7;
        int[] res = searchRange(arr, target);
        System.out.print(res[0]+" "+res[1]);
    }
}
