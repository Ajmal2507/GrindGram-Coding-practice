import java.util.HashSet;
/*

*/
class Arraysubset{
    public static boolean solution(int[] a, int[]b){
        HashSet<Integer> ans = new HashSet<>();
        for(int num:a){
            ans.add(num);
        }
        for(int num:b){
            if(!ans.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = { 11, 1, 13, 21, 3, 7 };
        int[] b = { 11, 3, 7, 1 };
        if(solution(a,b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}