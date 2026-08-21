
import java.util.Map;
import java.util.HashMap;

/*
169. Majority Element
Solved
Easy
Topics
premium lock icon
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:
*/
public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        int key = 0;
        int value = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>value){
                value = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println("Majority Element: "+key);
    }
}
