package Arrays;

public class Largest {

    // First Largest element...
    static int large = 0;
    static int Solution(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }

    // Second Largest element...
    static int flarge = 0;
    static int slarge = 0;
    static int Ssolution(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>flarge){
                slarge = flarge;
                flarge = arr[i];
            }
            if(arr[i]>slarge && arr[i]!=flarge){
                slarge = arr[i];
            }
        }
        return slarge;
    }

    public static void main(String[] args) {
         int[] arr = {11,2,3,4,2,66,9,85,4};
         System.out.println("Largest Element in the array is: "+Solution(arr));
         System.out.println("The Second largest element is: "+Ssolution(arr));
    }
}
