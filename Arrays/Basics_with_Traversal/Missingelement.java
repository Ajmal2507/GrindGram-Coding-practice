
public class Missingelement {
    public static int solution(int[] arr){
        int n = arr.length+1;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum += arr[i];
        }
        int total = (n*(n+1))/2;
        return total - sum;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,4,5,3,7,1};
        System.out.println("The Missing Element in the array is: "+solution(arr));
    }
}
