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
        
        //BRUTE -FORCE APPROACH - O(N^3)
        // List<List<Integer>> res = new ArrayList<>();
        // for (int i = 0 ; i<nums.length ; i++)
        // {
        //     for (int j =0 ; j<nums.length ; j++)
        //     {
        //         for(int k = 0; k <nums.length ; k++)
        //         {
        //              List<Integer> temp= new ArrayList<>();          

        //             if(nums[i] + nums[j] + nums[k] == 0 && i!=k && i!=j && j!=k)
        //             {
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]); 
        //                 temp.add(nums[k]); 

        //                 Collections.sort(temp);
        //                 if (!res.contains(temp))
        //                 {
        //                     res.add(temp);
        //                 }
        //             }
                  
        //         }
        //     }
        // }
        // return res; 

       ArrayList<List<Integer>> res = new ArrayList<>(); 
        //OPTIMAL APPROACH - O(N^2)
        Arrays.sort(nums);
        for (int i = 0 ; i< nums.length-2 ; i++)
        {
            // Skip duplicate first values
    if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
    }
             int left = i+1; 
            int right = nums.length-1 ; 

            while ( left < right  ) {
                ArrayList<Integer> temp = new ArrayList<>(); 
// -4 -1  -1 0 1 2 


                int sum = nums[left] + nums[right] + nums[i];
                if ( sum < 0 )
                {
                    left++; 
                }
                else if ( sum > 0 )
                {
                    right--;
                }
               else if (sum == 0 )
                {
                    temp.add(nums[left]); 
                    temp.add(nums[right]); 
                    temp.add(nums[i]); 

                    Collections.sort(temp);
                
                        res.add(temp); 
                          // Skip duplicate left values
            while (left < right && nums[left] == nums[left + 1]) {
                left++;
            }

            // Skip duplicate right values
            while (left < right && nums[right] == nums[right - 1]) {
                right--;
            }

                    
                    right--; 
                    left++;
                }
            }
        }
        return res; 
    } 
}
