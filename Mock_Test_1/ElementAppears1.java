package Mock_Test_1;


public class ElementAppears1 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        // Found XOR operator
        /*
        a ^ a = 0 (Same number gives 0)
        a ^ 0 = a (Returns the number)
        So..
        */
       int res = 0;
       for(int num:arr){
        res = res ^ num;
       }
       System.out.println(res);
    }
}
