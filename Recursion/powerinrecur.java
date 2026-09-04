package Recursion;

public class powerinrecur {
    public static int pow(int num, int power){
        if(power == 1){
            return num;
        }
        return num * pow(num,power-1);
    }
    public static void main(String[] args) {
        int num = 2;
        int power = 4;
        int result = pow(num,power);
        System.out.println(result);
    }
}
/*
Problem 3 🔥

Write:

int power(int a, int b)

such that:

power(2, 5) → 32
power(3, 4) → 81
power(5, 2) → 25

Don't use Math.pow().
*/