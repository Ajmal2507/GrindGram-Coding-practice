import java.util.HashMap;

public class Twosum{
    public static String solution(int[] arr, int target){
        HashMap<Integer,Integer> obj = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int remainder = target - arr[i];

            if(obj.containsKey(remainder)){
                return "Yes"+" "+remainder+" "+arr[i];
            }
            obj.put(arr[i],1);
        }
        return "No";

    }
    public static void main(String[] args) {
        int[] arr = {7,3,2,5,1};
        int target = 9;
        System.out.println(solution(arr,target));
    }
}

