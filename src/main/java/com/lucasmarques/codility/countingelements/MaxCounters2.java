package com.lucasmarques.codility.countingelements;

import java.util.Arrays;

public class MaxCounters2 {

    public int[] solution(int N, int[] A) {

        int arraySize = A.length;
        int[] counters = new int[N];
        int maxCounter = 0;
        int maxCounterSum = 0;

        for (int K = 0; K < arraySize; K++) {
            int X = A[K];
            if (X == N + 1) {
                maxCounterSum += maxCounter;
                maxCounter = 0;
                counters = new int[N];
            } else if (X <= N) {
                counters[X - 1]++;
                if (counters[X - 1] > maxCounter) {
                    maxCounter = counters[X - 1];
                }
            }
        }

        if (maxCounterSum > 0) {
            for (int i = 0; i < N; i++) {
                counters[i] += maxCounterSum;
            }
        }

        return counters;
    }

    public static void main(String[] args) {

        MaxCounters2 maxCounters = new MaxCounters2();
        System.out.println(Arrays.toString(maxCounters.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4})));
        System.out.println(Arrays.toString(maxCounters.solution(10, new int[] {1, 2, 2})));
        System.out.println(Arrays.toString(maxCounters.solution(1, new int[] {1, 2})));
        System.out.println(Arrays.toString(maxCounters.solution(1, new int[] {1, 2})));

    }

}
