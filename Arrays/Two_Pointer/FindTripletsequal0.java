import java.util.*;

/*
Find triplets with zero sum
Solved
Difficulty: MediumAccuracy: 25.81%Submissions: 358K+Points: 4Average Time: 20m
Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero. Return true if such a triplet exists, otherwise, return false.

Examples:

Input: arr[] = [0, -1, 2, -3, 1]
Output: true
Explanation: The triplet [0, -1, 1] has a sum equal to zero.
Input: arr[] = [1, 2, 3]
Output: false
Explanation: No triplet with a sum of zero exists.
Input: arr[] = [-5, 3, 2, -1, 0, 1]
Output: true
Explanation: The triplet [-5, 3, 2] has a sum equal to zero.
*/

class FindTripletsequal0{
    public static boolean solution(int[] arr){
        int n = arr.length;
        int target =0;
        for(int i=0;i<n-2;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int remainder = target - arr[i] - arr[j];
                if(set.contains(remainder)){
                    return true;
                }
                set.add(arr[j]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.print(solution(arr));
    }
}
// Need to be Revised -> Important Pattern/Concept