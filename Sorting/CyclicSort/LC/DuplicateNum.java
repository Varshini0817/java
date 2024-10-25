package Sorting.CyclicSort.LC;

public class DuplicateNum {
    //Find duplicate from the array : 3,1,3,4,2
    public static int findDuplicate(int[] nums) {
        int i =0;
        while(i< nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
            else {
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.print(findDuplicate(arr));
    }
}
