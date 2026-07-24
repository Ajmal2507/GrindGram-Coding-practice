/*
GCD of two numbers
Solved
Difficulty: BasicAccuracy: 51.03%Submissions: 224K+Points: 1
Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4
Input: a = 60, b = 36
Output: 12
Explanation: GCD of 60 and 36 is 12
*/

public class Gcd {

    static int findGCD(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
            if(a!=0){
                return a;
            }else{
                return b;
            }    
        }
    public static void main(String[] args) {
        System.out.println(findGCD(20,28));
    }
}
