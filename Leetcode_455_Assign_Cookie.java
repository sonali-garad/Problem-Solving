// LEETCODE - 455 - ASSIGN COOKIE 

// Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

// Example 1:

// Input: g = [1,2,3], s = [1,1]
// Output: 1
// Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
// And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
// You need to output 1.
// Example 2:

// Input: g = [1,2], s = [1,2,3]
// Output: 2
// Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
// You have 3 cookies and their sizes are big enough to gratify all of the children, 
// You need to output 2.

// Constraints:

// 1 <= g.length <= 3 * 104
// 0 <= s.length <= 3 * 104
// 1 <= g[i], s[j] <= 231 - 1

import java.util.*;

public class Leetcode_455_Assign_Cookie {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("How many numbers do u want in greed factor array : ");
        n1 = sc.nextInt();
        System.out.print("How many numbers do u want in cookie size  array : ");
        n2 = sc.nextInt();
        int g[] = new int[n1];
        int s[] = new int[n2];
        System.out.print("Enter numbers for greed factor array :");
        for (int i = 0; i < n1; i++) {
            g[i] = sc.nextInt();
        }
        System.out.print("Enter numbers for size factor array :");
        for (int i = 0; i < n2; i++) {
            s[i] = sc.nextInt();
        }
        int res = solution(g, s);
        System.out.println("Output " + res);
    }

    public static int solution(int g[], int s[]) {
        // // Brute-force approach O(N^2)
        // int count = 0;
        // Arrays.sort(g);
        // Arrays.sort(s);
        // // 1 2 3 || 3 9
        // for (int i = 0; i < g.length; i++) {
        //     for (int j = 0; j < s.length; j++)
        //         if (s[j] >= g[i]) {
        //             count++;
        //             s[j] = Integer.MIN_VALUE;
        //             break;
        //         }
        // }
        // return count;

        //Optimized solution 
         Arrays.sort(g);
         Arrays.sort(s);
         int child = 0 , cookie = 0 ; 
         while( child < g.length && cookie < s.length )
            {
                // 1 2 3 || 1 3 
                if( g[child] <= s[cookie])
                {
                    child++;
                }
                cookie++;
            } 

        return child ; 
    }
}
