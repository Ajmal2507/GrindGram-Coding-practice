import java.util.*;
/*
Intersection of Arrays with Distinct
Solved
Difficulty: EasyAccuracy: 32.83%Submissions: 243K+Points: 2Average Time: 20m
Given two unsorted integer arrays a[] and b[] each consisting of distinct elements, the task is to return the count of elements in the intersection (or common elements) of the two arrays.

Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Examples:

Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
Output: 1
Explanation: 89 is the only element in the intersection of two arrays.
Input: a[] = [1, 2, 4, 3, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: 4
Explanation: 3, 4, 5, and 6 are the elements in the intersection of two arrays.
Input: a[] = [20, 10, 30, 50, 40], b[] = [15, 25, 30, 20, 35]
Output: 2
Explanation: 20 and 30 are the elements in the intersection of the two arrays.
*/
public class FindIntersection {
    public static int solution(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            if(set.contains(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};
        // Return the count of common numbers from both the Arrays....
        System.out.println(solution(a,b));
    }
}
