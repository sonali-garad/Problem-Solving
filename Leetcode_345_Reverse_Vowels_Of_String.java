// LEETCODE - 345 - REVERSE VOEWLS IN STRING 


// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

import java.util.*;
public class Leetcode_345_Reverse_Vowels_Of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s; 
        System.out.print("Enter string s : ");
        s = sc.nextLine(); 
        String res = solution(s); 
        System.out.println("output : "+res);
    }
    public static String solution (String s )
    {
        int left = 0, right = s.length()-1;
        char array[] = s.toCharArray(); 
        //leetcode -> leotcede 
        while (left < right) {
            char leftchar = s.charAt(left); 
            char rightchar = s.charAt(right); 


            if(isVowel(rightchar) && isVowel(leftchar))
            {
                char temp = leftchar; 
                array[left] = rightchar;
                array[right] = temp; 
                left++; 
                right--; 
            }

            if (isVowel(leftchar))
            {
                if(!isVowel(rightchar))
                {
                    right--;   
                }
            }

            if(isVowel(rightchar))
            {
                if(!isVowel(leftchar))
                {
                    left++;
                }
            }

            if (!isVowel(rightchar) && !isVowel(leftchar))
            {
                left++; 
                right--; 
            }
        } 
        // String res = new String(array);
        return  new String(array);
    }

    public static boolean isVowel (char c)
    {
        if ( c== 'a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c =='I' || c =='O' || c=='U')
        {
            return true ; 
        }
        return false; 
    }
}
