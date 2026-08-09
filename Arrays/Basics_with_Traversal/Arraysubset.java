import java.util.HashSet;
/*
Array Subset
Difficulty: BasicAccuracy: 44.05%Submissions: 585K+Points: 1Average Time: 20m
Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].

Examples:

Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]
Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: false
Explanation: b[] is not a subset of a[]
*/
class Arraysubset{
    public static boolean solution(int[] a, int[]b){
        HashSet<Integer> ans = new HashSet<>();
        for(int num:a){
            ans.add(num);
        }
        for(int num:b){
            if(!ans.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = { 11, 1, 13, 21, 3, 7 };
        int[] b = { 11, 3, 7, 1 };
        if(solution(a,b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}