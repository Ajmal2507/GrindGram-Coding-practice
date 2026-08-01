import java.util.Arrays;
public class Isequalarray {
    public static Boolean solution(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr1 = {1,5,4,3,9,2};
        int[] arr2 = {2,1,7,3,5,4};
        System.out.println(solution(arr1,arr2));
    }
}
// Iykyk broo.....