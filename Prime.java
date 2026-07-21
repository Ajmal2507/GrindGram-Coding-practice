public class Prime {
    public static boolean solution(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
