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
        // int water = 0;
        // for (int i = 1; i < height.length - 1; i++) {
        // int left = Integer.MIN_VALUE;
        // int right = Integer.MIN_VALUE;
        // int idx = 0;
        // int rightidx = i + 1;
        // // 3 5 4 1 7 6
        // int current = height[i];

        // while (idx < i) {
        // if (height[idx] > left) {
        // left = height[idx];
        // }
        // idx++;

        // }
        // while (rightidx < height.length) {
        // if (height[rightidx] > right) {

        // right = height[rightidx];
        // }
        // rightidx++;

        // }

        // int value = Math.min(right, left);
        // if (current <= value) {
        // water = value - current + water;

        // System.out.println("water : " + water);
        // }
        // }

        // return water;

        // Better soln : time o(n) and space o(n)
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];
        int water = 0;
        // 2 3 5 7 4 2 8
        leftmax[0] = height[0];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            // int left = i - 1;

            // int idx = 0;
            // while (i > idx) {
            // if (height[idx] > left)
            // {
            // left = height[idx];
            // leftmax[i] = left;
            // }
            // idx++;
            // }

            if (height[i - 1] >= leftmax[i - 1]) {
                leftmax[i] = height[i - 1];
            } else {
                leftmax[i] = leftmax[i - 1];
            }

        }

        for (int i = height.length - 2; i >= 0; i--) {
            // int right = Integer.MIN_VALUE;
            // 3 2 5 4 3
            // for (int j = i+1 ; j< height.length ; j++)
            // {
            // if (height[j] > right)
            // {
            // right = height[j];
            // rightmax[i] = right;
            // }
            // }
            rightmax[i] = Math.max(height[i + 1], rightmax[i + 1]);

        }
        System.out.println(Arrays.toString(leftmax));
        System.out.println(Arrays.toString(rightmax));

        for (int i = 1; i < height.length - 1; i++) {
            int value = Math.min(leftmax[i], rightmax[i]);
            if (height[i] <= value) {
                water = water + value - height[i];
            }
        }
        return water;

    }
}
