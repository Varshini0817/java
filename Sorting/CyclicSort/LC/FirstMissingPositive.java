package Sorting.CyclicSort.LC;
//41 Hard
//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    //Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            //using cyclic sort by considering only those nums>0 && num <= nums.length
            if(nums[i] > 0 &&  nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
            else{
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public  static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
        int[] arr1 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr1));
    }
}
