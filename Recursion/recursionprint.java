package Recursion;
import java.util.Scanner;

public class recursionprint {
    public static void printReverse(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printReverse(num -1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        printReverse(num);
    }
}
/*
O/P -> 
10
9
8
7
6
5
4
3
2
1
*/