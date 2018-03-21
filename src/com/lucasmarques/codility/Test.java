package com.lucasmarques.codility;

/**
 * Created by lucascmarques on 31/01/17.
 */
public class Test {

    public int[] solution(int[] nums) {

        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] result = new int[length];

        int leftTemp = 1;
        int rightTemp = 1;

        for (int i = 0; i < length; i++) {

            int j = length - 1 - i;
            left[i] = leftTemp;
            right[j] = rightTemp;
            leftTemp *= nums[i];
            rightTemp *= nums[j];

        }

        for (int i = 0; i < length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;

    }

    public static void main(String[] args) {

        Test test = new Test();
        int[] result = test.solution(new int[] {2, 2, 3, 4});
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + ": " + result[i]);
        }

    }

}
