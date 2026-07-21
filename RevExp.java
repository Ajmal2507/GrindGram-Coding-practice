import java.net.SocketPermission;

/**
 * RevExp
 * Raise to Power of Its Own Reverse
Solved
Difficulty: MediumAccuracy: 20.22%Submissions: 381K+Points: 4
Given a number n, find the value of n raised to the power of its own reverse. The result will always fit into a 32-bit signed integer.

Examples:

Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 22 = 4.
Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 10 raised to the power 1 is 10.
 */
import java.util.*;
public class RevExp {

    static int reverseExponentiation(int n){
        int reverse = 0;
        int original = n;
        while(n!=0){
            int digit = n%10;
            reverse = reverse * 10+digit;
            n = n/10;
        }
        int power = (int) Math.pow(original,reverse);
        return power;
    }
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(2));
    }
}