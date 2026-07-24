package Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,7,2,3,4,4,5,6};
        boolean a = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                a = true;
            }else{
                a = false;
                break;
            }
        }
        System.out.println("Is the array is Sorted: "+a);
    }
}
