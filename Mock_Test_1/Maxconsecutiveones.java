package Mock_Test_1;
/*
485. Max Consecutive Ones
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
*/
public class Maxconsecutiveones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        int count = 0;
        int result = 0;
        for(int num:nums){
            if(num==1){
                count++;
            }else if(count>result){
                result = count;
                count = 0;
            }else{
                count = 0;
            }
        }
        if(count>result){
            result = count;
        }
        System.out.println("The Max consecutive ones in the Array is: "+result);
    }
}
