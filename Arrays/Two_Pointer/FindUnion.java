import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class FindUnion {
    public static ArrayList<Integer> Solution(int[] a, int[]b){
        Set<Integer> set = new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        ArrayList<Integer> arr = new ArrayList<>(set);
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        System.out.println(Solution(a,b));
    }
}
