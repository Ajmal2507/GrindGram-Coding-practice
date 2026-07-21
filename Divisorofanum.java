import java.util.*;

public class Divisorofanum {

    public static List<Integer> printdivisors(int n){
        List<Integer> li = new ArrayList<>();

        int i;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                li.add(i);
            }
        }
        for(i--;i>=1;i--){
            if(n%i==0 && i!=n/i){
                li.add(n/i);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        System.out.println(printdivisors(10));
    }
}
