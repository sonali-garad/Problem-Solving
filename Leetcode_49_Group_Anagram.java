import java.util.*;
public class Leetcode_49_Group_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str[];
        int n ; 
        System.out.print("How many string do u want in str array :");
        n = sc.nextInt(); 
        str = new String[n];
        for (int i = 0; i<n ; i++)
        {
            str[i] = sc.nextLine();
        }
        List<List<String>> res = solution(str);
        System.out.println("output : "+res);

    }
    public static List<List<String>> solution (String[] str)
    {
        List<List<String>> list = new ArrayList<List<String>>() ;
        List<String> list1 = new ArrayList<>();
  
        for (int i = 0 ; i<str.length ; i++)
        {
            char array[] = str[i].toCharArray();
            int len = array.length;
           boolean flag = false ;
            for(int j= i+1 ; j<str.length ; j++)
            {
             char compare[] = str[j].toCharArray();
             int idx = 0 ; 
             int comp= 0 ;
              while (len > 0) {
                if(array[idx] == compare[comp] && comp < compare.length)
                {
                    flag = true ;
                }
                idx--;
                comp++;
              }  
               if (flag)
            {
                list1.add(str[j]);
             
            } 
            }
            list.add(list1);

             //[res, ser , tan, nat ]
    }
    System.out.println(list);
    return null;
}
}
