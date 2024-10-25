package Sorting.CyclicSort.LC;

import java.util.Arrays;

//645
//https://leetcode.com/problems/set-mismatch/ 
public class SetMismatch {
    //Return the number that occurs twice and the number that is missing
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }else{
                i++;
            }
        }
        int[] arr = new int[2];
        for(i=0; i<nums.length;i++){
            if(nums[i] != i+1){
                arr[0] = nums[i];
                arr[1] = i+1;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        System.out.print(Arrays.toString(findErrorNums(arr)));
    }
}
