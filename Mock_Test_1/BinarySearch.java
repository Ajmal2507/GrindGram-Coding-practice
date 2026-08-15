package Mock_Test_1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,9};
        int k = 7;
        int low = 0;
        int high = arr.length  -1;
        while(high>low){
            int mid = low + (high - low)/2;
            if(arr[mid] == k){
                System.out.println(arr[mid]);
                return;
            }else if(arr[mid] > k){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
    }
}
