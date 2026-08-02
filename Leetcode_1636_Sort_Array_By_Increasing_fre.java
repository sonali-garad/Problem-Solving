// LEETCODE - 1636 - SORT ARRAY BY INCREASING FREQUENCY 
// Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

// Return the sorted array.

// Example 1:

// Input: nums = [1,1,2,2,2,3]
// Output: [3,1,1,2,2,2]
// Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
// Example 2:

// Input: nums = [2,3,1,3,2]
// Output: [1,3,3,2,2]
// Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
// Example 3:

// Input: nums = [-1,1,-6,4,5,-6,1,4,1]
// Output: [5,-1,4,4,-6,-6,1,1,1]

// Constraints:

// 1 <= nums.length <= 100
// -100 <= nums[i] <= 100

import java.util.*;

public class Leetcode_1636_Sort_Array_By_Increasing_fre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int nums[];
        System.out.print("Enter how many numbers u want in an array : ");
        n = sc.nextInt();
        nums = new int[n];
        System.out.print("Enter numbers in array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res[] = solution(nums);
        System.out.println("op : " + Arrays.toString(res));
    }

    // 2 2 1 2 3
    public static int[] solution(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int i = 0;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> {

            if (a.getValue() != b.getValue()) {
                System.out.println(a.getValue() - b.getValue());
                return a.getValue() - b.getValue();
            }

            return b.getKey() - a.getKey();
        });
        for (int j = 0; j < list.size(); j++) {
            int value = list.get(j).getValue();
            while (value > 0) {
                ans[i] = list.get(j).getKey();
                i++;
                value--;

            }

        }
        return ans;
    }
}
