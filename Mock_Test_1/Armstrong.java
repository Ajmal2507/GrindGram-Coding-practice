package Mock_Test_1;
/*
Q3. Armstrong Number

Check whether a number is an Armstrong number.

Example:

Input: 153
Output: true

Because:

1³ + 5³ + 3³ = 153
*/
public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int count = 0;
        while(num!=0){
            int digit = num%10;
            count = count + (int) Math.pow(digit, 3);
            num/=10;
        }
        if(count == original){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
