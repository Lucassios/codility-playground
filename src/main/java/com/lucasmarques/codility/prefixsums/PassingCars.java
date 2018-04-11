package com.lucasmarques.codility.prefixsums;

public class PassingCars {

    public int solution(int[] A) {

        int carsEast = 0;
        int passingCarsPairs = 0;

        for (int i = 0; i < A.length; i++) {

            int carDirection = A[i];
            if (isTravelingEast(A[i])) {
                carsEast++;
            } else {
                if (carsEast > 0) {
                    passingCarsPairs += carsEast;
                    if (isExcedingLimitPassingCars(passingCarsPairs)) {
                        return -1;
                    }
                }
            }

        }

        return passingCarsPairs;

    }

    public boolean isExcedingLimitPassingCars(int passingCarsPairs) {
        return passingCarsPairs > 1000000000;
    }

    public boolean isTravelingEast(int x) {
        return x == 0;
    }

    public static void main(String[] args) {

        PassingCars passingCars = new PassingCars();
        System.out.println(passingCars.solution(new int[] {0, 1, 0, 1, 1}));
        System.out.println(passingCars.solution(new int[] {0, 0, 0, 0}));
        System.out.println(passingCars.solution(new int[] {0, 0, 0, 0, 1}));
        System.out.println(passingCars.solution(new int[] {0, 1}));
        System.out.println(passingCars.solution(new int[] {0, 0}));
        System.out.println(passingCars.solution(new int[] {1, 0}));
        System.out.println(passingCars.solution(new int[] {0}));
        System.out.println(passingCars.solution(new int[] {1}));

    }

}
