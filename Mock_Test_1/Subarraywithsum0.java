package Mock_Test_1;

import java.util.HashSet;

/*
Q6. Subarray With Sum 0

Determine whether an array contains a subarray whose sum is zero.

Input:
[4, 2, -3, 1, 6]


Output:
true

Because:

2 + (-3) + 1 = 0

Think carefully about how prefix sums + HashSet can help.

*/


public class Subarraywithsum0 {

    public static void main(String[] args) {

        int[] arr = {4, 2, -3, 1, 6};

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        for (int num : arr) {

            sum += num;

            if (sum == 0) {
                System.out.println(true);
                return;
            }

            if (set.contains(sum)) {
                System.out.println(true);
                return;
            }

            set.add(sum);
        }

        System.out.println(false);
    }
}
