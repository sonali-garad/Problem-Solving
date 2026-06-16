// LEETCODE - 169 - MAJORITY ELEMENT 

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109
// The input is generated such that a majority element will exist in the array.

import java.util.*;

public class Leetcode_169_Majority_Element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, nums[];
        System.out.print(" How many elements do u want in nums array : ");
        n = sc.nextInt();
        nums = new int[n];
        System.out.print(" Fill elements for nums array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res = solution(nums);
        System.out.println("Output : " + res);
    }

    public static int solution(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> values : map.entrySet()) {
            if (values.getValue() > nums.length / 2) {
                return values.getKey();
            }
        }

        return -1;
    }
}
