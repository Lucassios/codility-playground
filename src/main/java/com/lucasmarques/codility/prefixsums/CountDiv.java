package com.lucasmarques.codility.prefixsums;

public class CountDiv {

    public int solution(int A, int B, int K) {

        int divB = B / K;
        int divA = (A - 1) / K;

        if(A == 0){
            divA = 0;
            divB++;
        }

        return divB - divA;

    }

    public static void main(String[] args) {

        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(10, 30, 3));
        System.out.println(countDiv.solution(6, 11, 2));
        System.out.println(countDiv.solution(1, 2, 1));
        System.out.println(countDiv.solution(11, 345, 17));
        System.out.println(countDiv.solution(10, 10, 5));

    }

}
