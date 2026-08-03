// LEETCODE - 451 - SORT CHARACTER BY FREQUENCY 

// Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

// Return the sorted string. If there are multiple answers, return any of them.

// Example 1:

// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
// Example 2:

// Input: s = "cccaaa"
// Output: "aaaccc"
// Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.
// Example 3:

// Input: s = "Aabb"
// Output: "bbAa"
// Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
// Note that 'A' and 'a' are treated as two different characters.

// Constraints:

// 1 <= s.length <= 5 * 105
// s consists of uppercase and lowercase English letters and digits.

import java.util.*;

public class Leetcode_451_Sort_char_by_fre {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter S string : ");
        s = sc.nextLine();
        String res = solution(s);
        System.out.println("Output : " + res);
    }

    public static String solution(String s) {
        // tree -> eert || eetr
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        System.out.println("list " + list);
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i).getValue();
            while (value > 0) {
                ans.append(list.get(i).getKey());
                value--;
            }

        }
        return ans.toString();

    }
}
