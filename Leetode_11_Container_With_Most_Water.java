//// LEETCODE - 11 - CONTAINER WITH MOST WATER 


// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1
 

// Constraints:

// n == height.length
// 2 <= n <= 105
// 0 <= height[i] <= 104
 




import java.util.*;
public class Leetode_11_Container_With_Most_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n, height[]; 
        System.out.print("How many numbers do u want in the height array : ");
        n = sc.nextInt(); 
        height = new int [n];
        for(int i =0 ; i<n ; i++)
        {
            height[i] = sc.nextInt();
        }
        int res = solution(height);
        System.out.println("output "+res);
    }
    public static int solution (int height [])
    {
        // int max = 0, height1, width ; 
        // for (int i = 0 ; i<height.length ; i++)
        // {
        //     int compare = height[i]; 
        //     for (int j = i+1 ; j< height.length ; j++)
        //     {
        //         // 2 4 7 
        //         //-> 2,4 || 2,7 || 4,7
        //     //    int height1, width;          
        //         height1 = Math.min(compare, height[j]);
        //         width = j -i;
        //         max = Math.max(max, height1*width);
                
        //     }

        // }
        // return max;



        int left = 0 , right = height.length-1, ans = 0  ; 
        // 10 3 7
        while (left <right ) {
            int height1 = Math.min(height[left], height[right]);
            int width = right - left; 
            int maxArea = height1 *width ; 
            ans = Math.max(ans, maxArea); 
            if (height[left] < height [right])
            {
                left ++;
            }
            else 
            {
                right --; 
            }
            
        }
        return ans; 
    }
}
