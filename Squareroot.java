public class Squareroot{

    public static int solution(int n){
        int low = 0;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((long) mid*mid <=n){
                low = mid + 1;
                ans = mid;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(11));
    }
}