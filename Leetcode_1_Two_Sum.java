//LEETCODE 1 : TWO SUM 

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.*;

public class Leetcode_1_Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target, nums[], n;
        System.out.print("Enter value of target : ");
        target = sc.nextInt();
        System.out.print(" How many numbers do u want for nums array : ");
        n = sc.nextInt();
        nums = new int[n];
        System.out.print("Fill nums array : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int res[] = solution(target, nums);
        System.out.println("output : " + Arrays.toString(res));
    }

    public static int[] solution(int target, int nums[]) {
        // // 2 7 9 0 || 9
        // //BRUTE- FORCE
        // for (int i = 0 ; i <nums.length ; i++)
        // {
        // for (int j = i+1 ; j<nums.length ; j++)
        // {
        // if(nums[i]+nums[j] == target)
        // {
        // return new int[] {i,j};
        // }
        // }
        // }
        // return null;

        // OPTMIZATION
        // 1 2 3 4 || 6
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { i, map.get(need) };
            }
            map.put(nums[i], i);
        }
        return null;

    }
}