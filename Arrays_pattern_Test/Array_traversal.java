// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Array_traversal {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,5,2,48};
        int max = arr[0];
        int smax = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.print(smax);
    }
}