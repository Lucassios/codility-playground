package com.lucasmarques.codility;

/**
 * Created by lucascmarques on 31/01/17.
 */
public class BinaryGap {

    public int solution(int n) {

        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        int i = binary.length() - 1;

        while (binary.charAt(i) == '0') {
            i--;
        }

        int count = 0;
        int max = 0;
        for (; i >= 0; i--) {
            if (binary.charAt(i) == '0') {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println("Solution: " + binaryGap.solution(15));
    }

}
