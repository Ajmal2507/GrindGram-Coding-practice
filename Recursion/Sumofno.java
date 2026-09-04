package Recursion;

public class Sumofno {
    public static int sum(int n){
        if(n == 1){
            return n;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int num = 5;
        int result = sum(num);
        System.out.println(result);
    }
}

/*
For example:

sum(5) → 15
sum(3) → 6
sum(1) → 1
*/
