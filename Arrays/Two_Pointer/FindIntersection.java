import java.util.*;
public class FindIntersection {
    public static int solution(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            if(set.contains(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};
        // Return the count of common numbers from both the Arrays....
        System.out.println(solution(a,b));
    }
}
