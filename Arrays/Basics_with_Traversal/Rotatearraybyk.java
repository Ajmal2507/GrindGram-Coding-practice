import java.util.ArrayList;

/*
Rotate the Array by K elements
Input: [0, 1, 2, 3, 4, 5, 6, 7]
Output: [3, 4, 5, 6, 7, 0, 1, 2]
*/

class Rotatearraybyk{
    public static ArrayList<Integer> solution(ArrayList<Integer> list,int k){
        int n = list.size();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=k;i<n;i++){
            num.add(list.get(i));
        }
        for(int i=0;i<k;i++){
            num.add(list.get(i));
        }
        return num;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<8;i++){
            list.add(i);
        }
        int k = 3;
        System.out.println(list);
        System.out.println(solution(list,k));
    }
}