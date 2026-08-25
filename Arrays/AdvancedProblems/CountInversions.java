public class CountInversions{
    public static int inversionCount(int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = arr.length-1;j>=0;j--){
                if(i<j && arr[i]>arr[j]){
                    count++;
                }
            }
        }
        /*
            int count = 0;
            int i = 0;
            int j = arr.length-1;
            while(i<j){
                if(arr[i]>arr[j]){
                    count++;
                }
                i++;
                j--;
            }
        */
        return count;
    }
    public static void main(String[] args) {
        // int arr[] = {2, 4, 1, 3, 5};
        int arr2[] = {10, 10, 10};
        System.out.println(inversionCount(arr2));
    }
}