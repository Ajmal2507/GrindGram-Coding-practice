import java.util.Arrays;
public class kthElement {

/*
K-th element of two Arrays
Solved
Difficulty: MediumAccuracy: 37.4%Submissions: 418K+Points: 4Average Time: 15m
Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

Examples :

Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
Input: a[] = [1, 4, 8, 10, 12], b[] = [5, 7, 11, 15, 17], k = 6
Output: 10
Explanation: Combined sorted array is [1, 4, 5, 7, 8, 10, 11, 12, 15, 17]. The 6th element of this array is 10.
*/

    // Kth element of 2 sorted arrays
    public static int solution(int[] a, int[] b, int k){
        int n = a.length + b.length;
        int[] arr = new int[n];
        int i = 0;
        for(int num:a){
            arr[i] = num;
            i++;
        }
        for(int num:b){
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        // After merging of 2 arrays return the 5th element;
        System.out.println(solution(a,b,k));
    }
}
