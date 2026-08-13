package Mock_Test_1;

/*
Q2. Majority Element

Given an array, find the element that appears more than n/2 times.

Input:
[2, 2, 1, 1, 1, 2, 2]

Output:
2


You've technically encountered this already, but now solve it without HashMap.

Target:

O(n) time
O(1) space


Interview frequency: ⭐⭐⭐⭐⭐
*/
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,3,2,1,1,1,2,2,3,3,3,4};
        int candidate = 0;
        int count = 0;
        for(int num: arr){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(candidate);

    }
}
