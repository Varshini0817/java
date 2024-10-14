package Practise;

import java.util.Scanner;

//Return max sub array with the largest sum
public class MaxSubArray {
        public int maxSubArray(int[] nums) {
            int maxC = nums[0], maxG = nums[0];
            for(int i=1; i<nums.length;i++){
                maxC = Math.max(nums[i], maxC + nums[i]);
                if(maxC > maxG){
                    maxG = maxC;
                }
            }
            return maxG;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        MaxSubArray solution = new MaxSubArray();
        int result = solution.maxSubArray(nums);

        System.out.println("Maximum subarray sum is: " + result);
    }
}
