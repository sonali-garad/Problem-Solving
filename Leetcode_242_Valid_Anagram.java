//LEETCODE - 242 - VALID ANAGRAM 
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
import java.util.*;

public class Leetcode_242_Valid_Anagram {
    public static void main(String args[]) {
        String s, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type String s: ");
        s = sc.nextLine();
        System.out.print("Type String for t:  ");
        t = sc.nextLine();
        boolean res = solution(s, t);
        System.out.println("Output " + res);
    }

    public static boolean solution(String s, String t) {
        // rat -> tars
        // Brute force approach
        // if(s.length() != t.length())
        // return false;
        // char array[] = t.toCharArray();

        // for (int i = 0 ; i <s.length() ; i++ )
        // {
        // boolean flag = false ;
        // int idx = t.length()-1 ;
        // char c = s.charAt(i);
        // while (idx >= 0 ) {
        // System.out.println(" value of c char: "+ c + " at index:" + i);
        // System.out.println("value of t char: "+t.charAt(idx) + " at index: "+idx) ;
        // if (c == array[idx])
        // {
        // System.out.println("am here ");
        // flag = true ;
        // array[idx] = '#';
        // break;
        // }
        // idx --;

        // }
        // if(!flag)
        // return false;

        // }
        // return true ;

        if (s.length() != t.length())
            return false;

        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        System.out.println("map : " + map1);
        System.out.println("map2 " + map2);

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            Integer value = entry.getValue();
            char key = entry.getKey();
            System.out.println("value of map1 " + value);
            System.out.println("value of map 2 " + map2.get(key));
            if (!value.equals(map2.get(key))) {
                return false;
            }
        }

        return true;
    }
}