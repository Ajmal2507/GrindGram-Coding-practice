public class Movezerostoend{
    public static void solutions(int[] arr){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index] = 0;
            index++;
        }
        for(int num:arr){
            System.out.print(num+",");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,5,4,0,4,3,0,1,11,0};
        solutions(arr);
    }
}