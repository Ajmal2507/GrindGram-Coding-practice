public class CountInversions{
    public static int inversionCount(int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = arr.length-1;j>=0;j--){
                if(i<j && arr[i]>arr[j]){
                    count++;
                }
            }
        }
        /*
            int count = 0;
            int i = 0;
            int j = arr.length-1;
            while(i<j){
                if(arr[i]>arr[j]){
                    count++;
                }
                i++;
                j--;
            }
        */
        return count;
    }
    public static void main(String[] args) {
        // int arr[] = {2, 4, 1, 3, 5};
        int arr2[] = {10, 10, 10};
        System.out.println(inversionCount(arr2));
    }
}

/*
Count Inversions
Difficulty: MediumAccuracy: 16.93%Submissions: 797K+Points: 4
Given an array of integers arr[]. You have to find the Inversion Count of the array. Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.


*/
