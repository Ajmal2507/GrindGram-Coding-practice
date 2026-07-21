/*
Reverse digits
Solved
Difficulty: BasicAccuracy: 46.92%Submissions: 149K+Points: 1
You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

Examples:

Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.
Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.
Input : n = 12345 
Output: 54321
Explanation: By reversing the digits of number, number will change into 54321.
 */

/**
 * Reversedigits
 */
public class Reversedigits {

    static int reverse(int n){
        int original = n;
        int rev = 0;
        while(n!=0){
            int ldigit = n%10;
            rev = rev*10+ldigit;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(122));
    }
}