// LEETCODE - 344 - REVERSE STRING  

// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

// Constraints:

// 1 <= s.length <= 105
// s[i] is a printable ascii character.
import java.util.*;

public class Leetcode_344_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char s[];
        System.out.print("How many char want in s array : ");
        n = sc.nextInt();
        s = new char[n];
        System.out.print("Enter char for s array : ");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }
        solution(s);
    }

    public static void solution(char[] s) {
        int right = s.length - 1;
        // s o n a l i ;
        for (int left = 0; left < right; left++) {
            char start = s[left];
            char end = s[right];
            char temp = ' ';
            temp = start;
            s[left] = end;
            s[right] = temp;
            right--;

        }
        System.out.print("Output : " + Arrays.toString(s));

    }
}