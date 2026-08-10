
import java.util.HashSet;

/* 
Two Sum - Pair with Given Sum
Solved
Difficulty: EasyAccuracy: 30.61%Submissions: 600K+Points: 2Average Time: 20m
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

Examples:

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[]
*/

public class TwoSum {
    public static boolean solution(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        
        for(int num:arr){
            int remainder = target - num;

            if(set.contains(remainder)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {0,-1,2,-3,1};
        int target = -2;
        System.out.println(solution(arr,target));
    }
}
