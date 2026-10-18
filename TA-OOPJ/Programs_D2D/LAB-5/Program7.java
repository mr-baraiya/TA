// There is an integer array nums sorted in ascending order (with distinct values). 
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
// index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
// nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
// might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. 
// Given the array nums after the possible rotation and an integer target, return the 
// index of target if it is in nums, or -1 if it is not in nums.[C] 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0 
// Output: 4 
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3 
// Output: -1 

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int result = search(nums, target);
        System.out.println("Result: " + result);
        sc.close();
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left side is sorted
            if (nums[left] <= nums[mid]) {

                // Target is present in left side
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                }

                // Target is present in right side
                else {
                    left = mid + 1;
                }

            }

            // Right side is sorted
            else {

                // Target is present in right side
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
                
                // Target is present in left side
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}