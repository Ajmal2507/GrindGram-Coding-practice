package Recursion;
import java.util.Arrays;
public class DPFibonacci {
    public static int[] fib(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
    }
    public static void main(String[] args) {
        // Without recursion .. Nothing
        int n = 5;
        System.out.println(Arrays.toString(fib(n)));
    }
}
