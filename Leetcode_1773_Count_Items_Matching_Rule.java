// LEETCODE - 1773 - COUNT ITEMS MATCHNG RULE
// You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

// The ith item is said to match the rule if one of the following is true:

// ruleKey == "type" and ruleValue == typei.
// ruleKey == "color" and ruleValue == colori.
// ruleKey == "name" and ruleValue == namei.
// Return the number of items that match the given rule.

// Example 1:

// Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
// Output: 1
// Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
// Example 2:

// Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
// Output: 2
// Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.

// Constraints:

// 1 <= items.length <= 104
// 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
// ruleKey is equal to either "type", "color", or "name".
// All strings consist only of lowercase letters.

import java.util.*;

public class Leetcode_1773_Count_Items_Matching_Rule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();
        String ruleKey = sc.next();
        String ruleValue = sc.next();

        for (int i = 0; i < 3; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(sc.next());
            }
            items.add(row);
        }
        int res = Solution(items, ruleKey, ruleValue);
        System.out.println("solution " + res);
    }

    // items = [["phone","blue","pixel"],
    // ["computer","silver","phone"],
    // ["phone","gold","iphone"]],
    // ruleKey = "type", ruleValue = "phone" [type, color, name ]
    // Output: 2
    public static int Solution(List<List<String>> items, String ruleKey, String ruleValue) {
        String arrType[] = { "type", "color", "name" };
        int count = 0;
        int checkPoint = 0;
        for (int i = 0; i < arrType.length; i++) {
            if (arrType[i].equals(ruleValue)) {
                checkPoint = i;
                break;
            }
        }
        System.out.println("checkpoint " + checkPoint);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(checkPoint).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
