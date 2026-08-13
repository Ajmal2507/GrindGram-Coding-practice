package Mock_Test_1;

/*
Q4. GCD

Find the GCD of two numbers.

Example:

Input: a = 48, b = 18
Output: 6

Target: Try to use the Euclidean algorithm rather than checking every number.
*/

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a!=0){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
    }
}
