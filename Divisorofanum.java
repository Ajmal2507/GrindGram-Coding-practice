/*
 Print all Divisors of a number
Easy
40/40
Average time to solve is 15m
Contributed by
500 upvotes
Asked in companies
Problem statement
Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.



For example:
'N' = 5.
The divisors of 5 are 1, 5.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
10
Sample Output 1 :
1 2 5 10
Explanation of Sample Input 1:
The divisors of 10 are 1,2,5,10.
Sample Input 2 :
6
Sample Output 2 :
1 2 3 6
Explanation of Sample Input 2:
The divisors of 6 are 1, 2, 3, and 6.
Constraints :
1 <= 'N' <= 10^5
*/

import java.util.*;

public class Divisorofanum {

    public static List<Integer> printdivisors(int n){
        List<Integer> li = new ArrayList<>();

        int i;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                li.add(i);
            }
        }
        for(i--;i>=1;i--){
            if(n%i==0 && i!=n/i){
                li.add(n/i);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        System.out.println(printdivisors(10));
    }
}
