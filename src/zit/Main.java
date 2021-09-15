package zit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        questionNumber1();
        questionNumber2();
        questionNumber3();
        questionNumber4();


    }

    static void questionNumber1() {
        int[] arr1 = new int[]{1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.print(arr1[i] + " ");
        }

    }


    static void questionNumber2() {
        System.out.println(" ");
        int[] arr2 = new int[101];
        for (int i = 1; i < 101; i++) {
            arr2[i] = i;
            System.out.print(arr2[i] + " ");
        }
    }


    static void questionNumber3() {
        System.out.println(" ");
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            } else {
            }
            System.out.print(arr3[i] + " ");
        }

    }

    static void questionNumber4() {
        System.out.println();
        int n = 6;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][n - i - 1] = 1;

            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }


    static void fillDiagonal() {

    }
}





