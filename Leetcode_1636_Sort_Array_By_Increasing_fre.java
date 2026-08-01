import java.util.*;
public class Leetcode_1636_Sort_Array_By_Increasing_fre {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n ; 
        int nums[];
        System.out.print("Enter how many numbers u want in an array : ");
        n = sc.nextInt();
        nums = new int[n];
        System.out.print("Enter numbers in array : ");
        for (int i =0 ; i<n ; i++ )
        {
            nums[i] = sc.nextInt();
        }
int res[] = solution(nums);
System.out.println(Arrays.toString(res));
    }
// 2 2 1 2 3
    public static int[] solution (int nums[])
    {
        TreeMap <Integer,Integer> map = new TreeMap<>();
        int ans[] = new int [nums.length];
        for(int i =0 ; i<nums.length ; i++ )
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1 );
        }
        System.out.println( map);
        int i = 0 ; 
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int value = entry.getValue();
            while(value > 0 )
            {
                ans[i] = entry.getKey();
                i++;
                value--;
            }
        }
        System.out.println(Arrays.toString(ans));
        return null;
    }
}
