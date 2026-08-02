// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2

// Output: [1,2]

// Example 2:

// Input: nums = [1], k = 1

// Output: [1]

// Example 3:

// Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

// Output: [1,2]

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// k is in the range [1, the number of unique elements in the array].
// It is guaranteed that the answer is unique.

import java.util.*;

public class Leetcode_347_Top_K_fre_ele {
    public static void main(String[] args) {
        int k, nums[], n;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do u want in nums array : ");
        n = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(" enter the value of k: ");
        k = sc.nextInt();
        int sol[] = solution(nums, k);
        System.out.println("Output " + Arrays.toString(sol));
    }

    public static int[] solution(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        int idx = 0;
        for (int i = 0; i < list.size(); i++) {
            if (k > 0) {
                ans[idx] = list.get(i).getKey();
                idx++;
            }
            k--;

        }
        return ans;
    }
}
