// LEETCODE - 1748 - SUM OF UNIQUE ELEMENTS

// You are given an integer array nums. The unique elements of an array are the
// elements that appear exactly once in the array.

// Return the sum of all the unique elements of nums.

// Example 1:

// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: 0
// Explanation: There are no unique elements, and the sum is 0.
// Example 3:

// Input: nums = [1,2,3,4,5]
// Output: 15
// Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100
import java.util.*;

public class Leetcode_1748_Sum_Of_Unique_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[], n;
        System.out.print("How many numbers do u want in nums array : ");
        n = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res = solution(nums);
        System.out.println("Output : " + res);
    }

    public static int solution(int nums[]) {
        int freq[] = new int[101];

        // Count frequency of every number
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int sum = 0;

        // Add only unique numbers
        for (int i = 0; i < nums.length; i++) {
            if (freq[nums[i]] == 1) {
                sum += nums[i];
            }
        }

        return sum;

    }
}