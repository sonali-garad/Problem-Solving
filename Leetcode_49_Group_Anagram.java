//LEETCODE - 49 - GROUP ANAGRAM 

// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
// Example 2:

// Input: strs = [""]

// Output: [[""]]

// Example 3:

// Input: strs = ["a"]

// Output: [["a"]]

// Constraints:

// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

import java.util.*;

public class Leetcode_49_Group_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[];
        int n;
        System.out.print("How many string do u want in str array :");
        n = sc.nextInt();
        sc.nextLine();
        str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        List<List<String>> res = solution(str);
        System.out.println("output : " + res);

    }

    public static List<List<String>> solution(String[] str) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String comapre = new String(c); // ant
            // check is key allready exits
            if (map.containsKey(comapre)) {
                map.get(comapre).add(str[i]);
            } else {
                List<String> list1 = new ArrayList<>();
                list1.add(s);
                map.put(comapre, list1);

            }

        }
        System.out.println(map);

        return new ArrayList<>(map.values());
    }
}
