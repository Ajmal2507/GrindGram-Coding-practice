class Two_pointers{
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};
        // move all zeros to the end
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j] = 0;
            j++;
        }
        for(int num:arr){
            System.out.print(num);
        }
    }
}