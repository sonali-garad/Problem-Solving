// LEETCODE - 42 - TRAPPING RAIN WATER  

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// Example 1:

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9

// Constraints:

// n == height.length
// 1 <= n <= 2 * 104
// 0 <= height[i] <= 105

import java.util.*;

public class Leetcode_42_Trapping_Rain_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, height[];
        System.out.print("How many numbers do u want in an array : ");
        n = sc.nextInt();
        height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int res = solution(height);
        System.out.println("output : " + res);
    }

    public static int solution(int height[]) {
        // brute force - o(n^2)
        int water = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int left = Integer.MIN_VALUE;
            int right = Integer.MIN_VALUE;
            int idx = 0;
            int rightidx = i + 1;
            // 3 5 4 1 7 6
            int current = height[i];

            while (idx < i) {
                if (height[idx] > left) {
                    left = height[idx];
                }
                idx++;

            }
            while (rightidx < height.length) {
                if (height[rightidx] > right) {

                    right = height[rightidx];
                }
                rightidx++;

            }

            int value = Math.min(right, left);
            if (current <= value) {
                water = value - current + water;

                System.out.println("water : " + water);
            }
        }

        return water;
    }
}
