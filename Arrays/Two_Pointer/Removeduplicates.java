import java.util.ArrayList;

class Removeduplicates{

    // Remove duplicates form the sorted array...
    /*

    ------ Some times fails if the result must be printed in sorted order

    public static ArrayList<Integer> solution(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }
    */
    public static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println(solution(arr));
    }
}