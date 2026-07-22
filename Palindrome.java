public class Palindrome {
    public static boolean solution(int n){
        int original = (int) Math.abs(n);
        int copy = (int) Math.abs(n);
        int count = 0;
        while(copy>0){
            int digit = copy%10;
            count = count * 10 + digit;
            copy/=10;
        }
        if(count == original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(solution(555));
    }
}
