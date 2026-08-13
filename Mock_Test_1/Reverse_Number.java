package Mock_Test_1;

public class Reverse_Number {
    public static void main(String[] args) {
        int num = 12340;
        int rev = 0;
    while(num>0){
        int a = num%10;
        rev = rev * 10 + a;
        num = num / 10;
    }
    System.out.println(rev);
    }
}
