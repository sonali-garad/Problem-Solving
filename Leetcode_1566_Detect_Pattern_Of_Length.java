//LEETCODE - 1566 - DETECT PATTERN OF LENGTH M REPEATED K OR MORE TIMES
// Given an array of positive integers arr, find a pattern of length m that is repeated k or more times.

// A pattern is a subarray (consecutive sub-sequence) that consists of one or more values, repeated multiple times consecutively without overlapping. A pattern is defined by its length and the number of repetitions.

// Return true if there exists a pattern of length m that is repeated k or more times, otherwise return false.

// Example 1:

// Input: arr = [1,2,4,4,4,4], m = 1, k = 3
// Output: true
// Explanation: The pattern (4) of length 1 is repeated 4 consecutive times. Notice that pattern can be repeated k or more times but not less.
// Example 2:

// Input: arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
// Output: true
// Explanation: The pattern (1,2) of length 2 is repeated 2 consecutive times. Another valid pattern (2,1) is also repeated 2 times.
// Example 3:

// Input: arr = [1,2,1,2,1,3], m = 2, k = 3
// Output: false
// Explanation: The pattern (1,2) is of length 2 but is repeated only 2 times. There is no pattern of length 2 that is repeated 3 or more times.

import java.util.*;

public class Leetcode_1566_Detect_Pattern_Of_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number do u want in array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter value of M: ");
        int m = sc.nextInt(); // length of pattern
        System.out.print("Enter value of K: ");
        int k = sc.nextInt(); // how many times pattern should be there
        System.out.print("Enter values for array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = Solution(arr, m, k);
        System.out.println("Result: " + res);
    }

    public static boolean Solution(int arr[], int m, int k) {
        return false;
    }
}