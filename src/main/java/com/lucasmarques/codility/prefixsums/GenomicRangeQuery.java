package com.lucasmarques.codility.prefixsums;

import java.util.Arrays;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {

        char[] dnaChars = S.toCharArray();
        // stores the quantity accumulated of each nucleotide (4 nucleotides)
        int[][] nucleotideSum = new int[4][S.length() + 1];
        int[] result = new int[P.length];

        for (int i = 0; i < dnaChars.length; i++) {
            char nucleotide = dnaChars[i];
            int factor = factor(nucleotide);
            int indexNucleotide = factor - 1; // the index of the nucleotide is the factor - 1
            for (int j = 0; j < 4; j++) {
                nucleotideSum[j][i + 1] = nucleotideSum[j][i]; // keeps the previous sum (like a counter)
            }
            nucleotideSum[indexNucleotide][i + 1]++;
        }

        Arrays.stream(nucleotideSum).forEach(ints -> System.out.println(Arrays.toString(ints)));

        for (int i = 0; i < P.length; i++) {
            int fromIndex = P[i];
            int toIndex = Q[i] + 1;
            for (int indexNucleotide = 0; indexNucleotide < 4; indexNucleotide++) {
                if (nucleotideSum[indexNucleotide][toIndex] - nucleotideSum[indexNucleotide][fromIndex] > 0) {
                    result[i] = indexNucleotide + 1; // the value of the factor is the index of the nucleotide + 1
                    break;
                }
            }
        }

        return result;

    }

    public int factor(char nucleotide) {
        switch (nucleotide) {
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
        }
        return 0;
    }

    public static void main(String[] args) {

        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        System.out.println(Arrays.toString(genomicRangeQuery.solution("CAGCCTA", new int[] {2, 5, 0}, new int[] {4, 5, 6})));

    }

}
