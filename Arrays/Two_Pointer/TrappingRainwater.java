public class TrappingRainwater {
    public static int trap(int[] arr){
        int n = arr.length;
        int left =0, right = n-1;
        int leftmax = 0, rightmax = 0;
        int result = 0;

        while(left<=right){
            if(arr[left]<=arr[right]){
                if(leftmax<arr[left]){
                    leftmax = arr[left];
                }else{
                    result += leftmax - arr[left];
                }
                left++;
            }else{
                if(rightmax<arr[right]){
                    rightmax = arr[right];
                }else{
                    result += rightmax- arr[right];
                }
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int solution = trap(arr);
        System.out.println(solution);
    }
}


/*
42. Trapping Rain Water
Solved
Hard
Topics
premium lock icon
Companies
Given n non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
*/