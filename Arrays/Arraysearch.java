package Arrays;

public class Arraysearch {
    public static void main(String[] args) {
        int[] arr = {10,8,30,4,5};
        int find = 5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                System.out.println("The Element found in the index:"+i);
            }
        }
    }
}
