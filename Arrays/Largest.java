package Arrays;

public class Largest {
    static int large = 0;
    static int Solution(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,2,6,9,4};
         System.out.println("Largest Element in the array is: "+Solution(arr));
    }
}
