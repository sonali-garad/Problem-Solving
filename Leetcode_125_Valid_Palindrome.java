//LEETCODE - 125  - VALID PALINDROME

//  phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.

import java.util.*;

public class Leetcode_125_Valid_Palindrome {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter string s :");
        s = sc.nextLine();
        boolean res = sol(s);
        System.out.println("output : " + res);
    }

    public static boolean sol(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        s1 = s1.toLowerCase();
        System.out.println(s1);
        int left = 0, right = s1.length() - 1;
        for (int i = 0; i < s1.length(); i++) {

            boolean flag = false;
            if (left < right) {
                if (s1.charAt(left) == (s1.charAt(right))) {
                    flag = true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
            left++;
            right--;
            // if( !flag) return false ;
        }
        return true;
    }
}
