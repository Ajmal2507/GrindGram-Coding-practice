public class Sort012 {
    public static int[] solution(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }

        return arr;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,0,0,2,1,2};
        int[] result = solution(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
