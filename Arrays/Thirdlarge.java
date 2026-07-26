package Arrays;

public class Thirdlarge {
    public static void main(String[] args) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        int[] arr = {1,2,5,34,65,76,32,6};

        for(int num:arr){
            if(num>first){
                third = second;
                second = first;
                first = num;
            }else if(num>second && num!=first){
                third = second;
                second = num;
            }else if(num > third){
                third = num;
            }
        }
        System.out.println("The Third largest number is:"+third);
    }
}
