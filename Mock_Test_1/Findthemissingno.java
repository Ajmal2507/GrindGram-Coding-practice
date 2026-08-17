package Mock_Test_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/*
448. Find All Numbers Disappeared in an Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
*/
public class Findthemissingno{
    public static List<Integer> findDisappearedNumbers(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}