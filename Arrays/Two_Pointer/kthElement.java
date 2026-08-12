import java.util.Arrays;
public class kthElement {
    // Kth element of 2 sorted arrays
    public static int solution(int[] a, int[] b, int k){
        int n = a.length + b.length;
        int[] arr = new int[n];
        int i = 0;
        for(int num:a){
            arr[i] = num;
            i++;
        }
        for(int num:b){
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        // After merging of 2 arrays return the 5th element;
        System.out.println(solution(a,b,k));
    }
}
