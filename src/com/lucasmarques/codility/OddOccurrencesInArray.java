package com.lucasmarques.codility;

import java.util.Arrays;

/**
 * Created by lucascmarques on 31/01/17.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {

        Arrays.sort(A);
        int i = 0;
        for (; i < A.length - 1; i++) {

            if (A[i] != A[i + 1]) {
                return A[i];
            } else {
                i++;
            }

        }

        return A[i];

    }

    public static void main(String[] args) {

        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        System.out.println(oddOccurrencesInArray.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
        System.out.println(oddOccurrencesInArray.solution(new int[] {2, 2, 3, 3, 4}));
        System.out.println(oddOccurrencesInArray.solution(new int[] {1,3,5,5,3,3,1}));

    }

}
