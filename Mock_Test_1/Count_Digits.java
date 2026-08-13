package Mock_Test_1;
/*
Section A — Basic Math

Q1. Count Digits

Given an integer n, return the number of digits.

Example:

Input: 12345
Output: 5
*/
public class Count_Digits {
    public static int solution(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(solution(num));
    }
}
