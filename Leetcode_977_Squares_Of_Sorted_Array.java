
// LEETCODE - 977 - SQUARES OF SORTED ARRAY 

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums is sorted in non-decreasing order.

// Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approac

import java.util.*;

public class Leetcode_977_Squares_Of_Sorted_Array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n, nums[];
        System.out.print(" How many numbers do u want in an array : ");
        n = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res[] = solution(nums);
        System.out.println("output :" + Arrays.toString(res));
    }

    public static int[] solution(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }
}