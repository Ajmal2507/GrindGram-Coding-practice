public class Rotatearrayby1 {
    public static void solution(int[] arr){
        int n = arr.length;
        int lastelement = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastelement;
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,7,2,6};
        solution(arr);
    }
}
