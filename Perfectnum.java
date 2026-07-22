public class Perfectnum {
    public static boolean solution(int n){
        int i;
        int count = 0;
        for(i=1;i*i<=n;i++){
            if(n%i==0 && i!=n){
                count+=i;
            }
        }
        for(i--;i>=1;i--){
            if(n%i==0 && i!=n/i && n!=n/i){
                count+=n/i;
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    
}
