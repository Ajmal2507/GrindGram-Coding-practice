package Recursion;
import java.util.*;
public class Fibonacci {
    public static int calculate(int num, int[] dp){
        
        if(num<=1){
            return num;
        }
        if(dp[num]!=-1){
            return dp[num];
        }
        dp[num] = calculate(num-1,dp) + calculate(num-2, dp);

        return dp[num];
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        int[] dp = new int[num+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<dp.length;i++){
            System.out.print(calculate(i,dp)+ " ");
        }
        
    }
}
