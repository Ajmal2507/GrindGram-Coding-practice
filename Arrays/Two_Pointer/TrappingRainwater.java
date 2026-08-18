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
