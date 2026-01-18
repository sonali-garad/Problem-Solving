
//LEETCODE - 1624 : Largest Substring between two equal charcters
// Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

// A substring is a contiguous sequence of characters within a string.

// Example 1:

// Input: s = "aa"
// Output: 0
// Explanation: The optimal substring here is an empty substring between the two 'a's.
// Example 2:

// Input: s = "abca"
// Output: 2
// Explanation: The optimal substring here is "bc".
// Example 3:

// Input: s = "cbzxy"
// Output: -1
// Explanation: There are no characters that appear twice in s.

// Constraints:

// 1 <= s.length <= 300
// s contains only lowercase English letters.

import java.util.*;

public class Leetcode_1624_Largest_Substring_between_Two_Equal_Char {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = CountLongestSubstring(s);
        System.out.println("Count of Longest Substring: " + res);

    }

    public static int CountLongestSubstring(String s) { 
        //Brute Force - O(n^2)
        // int count = 0;
        // boolean flag = false;
        // for (int i = 0; i < s.length(); i++) {
        //     char comp = s.charAt(i);
        //     for (int j = i + 1; j < s.length(); j++) {
        //         if (s.charAt(j) == comp) {
        //             count = Math.max(count, j - i - 1);
        //             flag = true;
        //         }

        //     }
        // }
        // if (flag) {
        //     return count;
        // }

        // return -1;

        //Optimization - Time:o(n), space: o(n)
        // HashMap<Character, Integer> map = new HashMap<>();
        // int max = -1 ;
        // for(int i = 0 ; i <s.length(); i++)
        // {
        //     char c = s.charAt(i);
        //     if(!map.containsKey(c))
        //     {
        //         map.put(c, i);
        //     }
        //     //aabcefhfa
        //     else 
        //     {
        //         max = Math.max(max,i-map.get(c)-1 );
        //     }

        // }
        // return max;

        //Optimization Again : Time: o(n), space : o(1)
        int arr[] = new int[26];
        Arrays.fill(arr, -1);
        int max= -1;
        for(int i= 0 ; i<s.length(); i++)
        {
            char c= s.charAt(i);
            int index = c-'a';
            //acdca
            if(arr[index] == -1)
            {
                arr[index] = i;
            }
            else
        //it means it has been allready marked - so now will calculate here distance from right to left index 
            {
                max = Math.max(max, i-arr[index]-1);
            }
        }
        return max;

    }
}