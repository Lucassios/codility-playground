package com.lucasmarques.codility;

import java.util.Arrays;

/**
 *
 * Write a function:
 *
 *  class Solution { public int solution(int[] A); }
 *  that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
 *
 *  For example, given:
 *
 *  A[0] = 1
 *  A[1] = 3
 *  A[2] = 6
 *  A[3] = 4
 *  A[4] = 1
 *  A[5] = 2
 *  the function should return 5.
 *
 *  Assume that:
 *
 *  N is an integer within the range [1..100,000];
 *  each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 *  Complexity:
 *
 *  expected worst-case time complexity is O(N);
 *  expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 *  Elements of input arrays can be modified.
 *
 */
public class MissingInteger {

    public int solution(int[] A) {

        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < A.length; i++) {

            int temp = A[i] - count;
            if (temp > 1) {
                return count + 1;
            } else if (temp == 1) {
                count++;
            }

        }

        return count + 1;

    }

    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        System.out.println(missingInteger.solution(new int[] {1, 3, 6, 4, 1, 2}));
        System.out.println(missingInteger.solution(new int[] {7, 4, 1, 3, 6, 5}));
        System.out.println(missingInteger.solution(new int[] {1, 3}));
        System.out.println(missingInteger.solution(new int[] {1}));
        System.out.println(missingInteger.solution(new int[] {2}));
        System.out.println(missingInteger.solution(new int[] {3}));
        System.out.println(missingInteger.solution(new int[] {11}));
        System.out.println(missingInteger.solution(new int[] {11, 8}));
        System.out.println(missingInteger.solution(new int[] {20, 18, 15, 6, 4, 2, 3, 8, 7, 1, 2, 3, 5, 6, 5}));
        System.out.println(missingInteger.solution(new int[] {}));
        System.out.println(missingInteger.solution(new int[] {-1, -2, 1, 3}));
    }

}
