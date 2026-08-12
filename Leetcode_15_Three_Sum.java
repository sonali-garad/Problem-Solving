import java.util.*;
public class Leetcode_15_Three_Sum {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n , nums[]; 
        System.out.print(" How many numbers do u want in nums array : ");
        n = sc.nextInt();
        nums = new int [n];  
        for (int i = 0 ; i<n  ; i++)
            {
                 nums[i] = sc.nextInt(); 
            } 
            List<List<Integer>> res = solution(nums); 
            System.out.println("res "+ res);
    
    }
    public static List<List<Integer>> solution (int nums[])
    {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0 ; i<nums.length ; i++)
        {
            for (int j =0 ; j<nums.length ; j++)
            {
                for(int k = 0; k <nums.length ; k++)
                {
                     List<Integer> temp= new ArrayList<>();          

                    if(nums[i] + nums[j] + nums[k] == 0 && i!=k && i!=j && j!=k)
                    {
                        temp.add(nums[i]);
                        temp.add(nums[j]); 
                        temp.add(nums[k]); 

                        Collections.sort(temp);
                        if (!res.contains(temp))
                        {
                            res.add(temp);
                        }
                    }
                  
                }
            }
        }
        return res; 
    } 
}
