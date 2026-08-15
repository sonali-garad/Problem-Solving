// LEETCODE - 611 - VALID TRIANGLE 

// Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

// Example 1:

// Input: nums = [2,2,3,4]
// Output: 3
// Explanation: Valid combinations are: 
// 2,3,4 (using the first 2)
// 2,3,4 (using the second 2)
// 2,2,3
// Example 2:

// Input: nums = [4,2,3,4]
// Output: 4

// Constraints:

// 1 <= nums.length <= 1000
// 0 <= nums[i] <= 1000

import java.util.*;

public class Leetcode_611_Vallid_Triangle {
    public static void main(String[] args) {
        int n, nums[];
        System.out.print("How many numbers do u want in an nums array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res = solution(nums);
        System.out.println("output : " + res);
    }

    public static int solution(int nums[]) {

        // //BRUTE-FORCE- O(N^2)
        // // 2 2 3 4 -- || 2 2 > 4 || 2 2 > 3 || 2 3 > 5
        // Arrays.sort(nums);
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // for (int k = j + 1; k < nums.length; k++) {
        // if (nums[i] + nums[j] > nums[k]) {
        // count++;
        // }
        // }
        // }

        // }
        // return count;

        // OPTIMAL APPROACH - O(N)
        int count = 0;
        Arrays.sort(nums);
        for (int i = 2 ; i < nums.length; i++) {
            // 2 3 4 4
            int left = 0 ;
            int right = i-1;
            while (left < right) {
                if (nums[left] + nums[right] >= nums[i]) {
                    count += right - left;
                    right--;

                } else {
                    left++;
                }
            }
        }

        return count;
    }
}