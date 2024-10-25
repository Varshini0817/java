package Sorting.CyclicSort.LC;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNums {
    //find all duplicates from the array : 4,3,2,7,8,2,3,1
    public static List<Integer> findDuplicates(int[] nums) {
        int i =0;
        while(i<nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i=0; i<nums.length; i++){
            if(i+1!= nums[i]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.print(findDuplicates(arr));
    }
}
