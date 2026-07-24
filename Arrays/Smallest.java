package Arrays;
public class Smallest {

    // Smallest element in an array...
    static int solution(int[] arr){
        int small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        return small;
    }

    // Second Smallest element in an array..
    static int ssolution(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }if(arr[i]<ssmallest && arr[i]!=smallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int[] arr = {65,41,56,23,98,1,12,6,31};
        System.out.println("The Smallest element in the Array is:"+solution(arr));
        System.out.println("The Second Smallest element is the array is: "+ssolution(arr));
    }
}
