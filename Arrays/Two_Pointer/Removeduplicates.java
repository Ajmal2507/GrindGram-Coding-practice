import java.util.ArrayList;

/*
        Remove Duplicates Sorted Array
        Solved
        Difficulty: EasyAccuracy: 38.18%Submissions: 396K+Points: 2Average Time: 20m
        You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared.
        Examples :

        Input: arr[] = [2, 2, 2, 2, 2]
        Output: [2]
        Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return array containing [2] after modifying the array.
        Input: arr[] = [1, 2, 4]
        Output: [1, 2, 4]
        Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].
*/


class Removeduplicates{

    // Remove duplicates form the sorted array...
    /*

    ------ Some times fails if the result must be printed in sorted order

    public static ArrayList<Integer> solution(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }
    */
    public static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println(solution(arr));
    }
}