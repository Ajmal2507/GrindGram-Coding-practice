package Mock_Test_1;

import java.util.HashSet;

public class Containsduplicate {
    /*
    Q3. Contains Duplicate

Determine whether an array contains any duplicate.

Input:
[1, 2, 3, 1]

Output:
true
Input:
[1, 2, 3, 4]

Output:
false
    */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        HashSet<Integer> set = new HashSet<>();
        boolean result = false;
        for(int num:arr){
            if(set.contains(num)){
                result = true;
                break;
            }
            set.add(num);
        }
        System.out.println(result);
    }
}
