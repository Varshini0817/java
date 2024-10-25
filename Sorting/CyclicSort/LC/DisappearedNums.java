package Sorting.CyclicSort.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNums {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i]-1] ){
                swap(nums, i, nums[i]-1);
            }
            else {
                i++;
            }
        }

        for(i=0; i<nums.length; i++){
            if(i!=nums[i]-1){
                res.add(i+1);
            }
        }
        return res;
    }
    public static void swap(int [] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.print(findDisappearedNumbers(arr));
    }
}
